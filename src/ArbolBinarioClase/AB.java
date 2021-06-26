package ArbolBinarioClase;

import java.util.LinkedList;
import java.util.List;

public class AB<T> {
	protected Nodo<T> raiz;
	
	public AB() {
		raiz = null;
	}

	public void agregar(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		if (raiz==null)
			raiz = nuevo;
		else
			agregar(raiz, nuevo);
	}

	protected void agregar(Nodo<T> nodo, Nodo<T> nuevo) {
		// TODO Auto-generated method stub
		if (nodo.getIzq()==null)
			nodo.setIzq(nuevo);
		else if (nodo.getDer()==null)
			nodo.setDer(nuevo);
		else
			// decisión arbitraria
			// el árbol se construye a izquierda
			agregar(nodo.getIzq(), nuevo);
	}
	
	public boolean pertenece(T elem) {
		return pertenece(raiz,elem);
	}
	
	protected boolean pertenece(Nodo<T> nodo, T elem) {
		if (nodo==null)
			return false;
		if (nodo.getInfo().equals(elem))
			return true;
		return pertenece(nodo.getIzq(),elem) ||
				pertenece(nodo.getDer(),elem);
	}

	public int altura(){
		return altura(raiz);
	}
	protected int altura(Nodo<T> nodo){
		if (nodo==null)
			return 0;
		else
			return 1 + Math.max( altura(nodo.getIzq()),
								 altura(nodo.getDer()) );
	}

	// Métodos de tarea para implementar
	// ---------------------------------
	
	// Retorna la cantidad de nodos
	public int cantNodos(){
		return cantNodos(raiz);
	}

	private int cantNodos(Nodo<T> nodo) {
		if(nodo==null)
			return 0;
		else
			return 1 + cantNodos(nodo.getIzq()) + cantNodos(nodo.getDer());
	}

	// Retorna si el árbol está o no balanceado
	//la complejidad de balanceado es O(n2) ya que en cada nodo que te pares, tenes que ver la altura
    //y a la vez tenes que pasar por todos los nodos, osea debes de ver la altura de todos los nodos
    //O(n)*O(n) = O (n2)
	public boolean estaBalanceado(){
			return estaBalanceado(raiz);
	}

	private boolean estaBalanceado(Nodo<T> nodo) {
		if(nodo==null)
			return true;
		return Math.abs(altura(nodo.getDer())-altura(nodo.getIzq()))<=1 &&
				estaBalanceado(nodo.getDer()) && 
				estaBalanceado(nodo.getIzq());
			
	}

	// Retorna la cantidad de hojas
	public int cantHojas() {
		return cantHojas(raiz);
	}

	private int cantHojas(Nodo<T> nodo) {
		if(nodo==null)
			return 0;
		if(nodo.getDer()==null && nodo.getIzq()==null)
			return 1;
		else
			return cantHojas(nodo.getDer()) + cantHojas(nodo.getIzq());
		
	}
	// Retorna el elemento en la posicion i, segun el recorrido inorden
	// Si el i no es un valor valido, retorna null
	// El minimo elemento es con i=0
	public T iesimo(int i) {
		if(i<0 || i>=cantNodos())
			return null;
		return iesimo(i,raiz);
	}
	
	private T iesimo(int i,Nodo<T> nodo) {
		int cantIzq = cantNodos(nodo.getIzq());
		if (i==cantIzq)
			return nodo.getInfo();
		if (i<cantIzq)	
			return iesimo(i,nodo.getIzq());
		return iesimo(i-(cantIzq+1),nodo.getDer()); //cantIzq+1 ya que le resto la raiz de ese subarbol tambien.
	}
	
	
	public boolean buscar(T elem) {
		if(raiz== null)
			return false;
		return buscar(elem, raiz);
	}

	
  protected boolean buscar(T elem, Nodo<T> nodo) {		
		if(nodo==null)
			return false;
		if(nodo.getInfo().equals(elem))
			return true;
		return  buscar( elem, nodo.getDer()) || buscar(elem, nodo.getIzq());
	}
  
  
  // Retorna un String con todos los elementos
  // del �rbol, siguiendo el recorrido inorden
  public String toString() {
	  return "{" + toStringInorden(raiz) + "}";
  }

  private String toStringInorden(Nodo<T> nodo) {
	  // TODO Auto-generated method stub
	  StringBuilder sb = new StringBuilder();
	  if (nodo!=null) {
		  sb.append( toStringInorden(nodo.getIzq()) );
		  sb.append(nodo.getInfo()).append(" ");
		  sb.append( toStringInorden(nodo.getDer()) );
	  }
	  return sb.toString();
  }

  
  public String preOrden() {
	  return "{" + toStringPreorden(raiz) + "}";
  }
  
  	//dado un nivel devuelve un string con los nodos por nivel entre corchetes,
	// o {} si el nivel no existe, por ej
	// abbint2.nodosPorNivel(3) = {1379}
	// no incluir separadores entre nodos, para que el test funcione
	
  	public String nodosPorNivel(int nivel) {
		return "{}";
	}
  	
  	
  	public int sumarInternos() {
  		if(raiz==null)
  			return 0;
  		else
  			return sumarInternos(raiz);
  	}
  	
	
  private int sumarInternos(Nodo<T> nodo) {
	  if(nodo == null)
		  return 0;
	  
		if (esHoja(nodo))
			return 0;
		
		if(nodo.equals(raiz))
			return  sumarInternos(nodo.getIzq()) + sumarInternos(nodo.getDer());
		else
			return (int)nodo.getInfo() + sumarInternos(nodo.getIzq()) + sumarInternos(nodo.getDer());
	}
  
  	//Complejidad O(n) - la cantidad de hoja(O(1)) - raiz (O(1)) = O(n)

   private int nivel(T info) {
	   if(!buscar(info))
			return -1;
		return nivel(info,raiz);
   }

   private int nivel(T info, Nodo<T> nodo) {
	if(nodo.getInfo().equals(info))
		return 1;
	else
		return 1 + nivel(info,nodo.getDer()) + nivel(info,nodo.getIzq());
   }

   protected boolean esHoja(Nodo<T> nodo) {
	   if (nodo.getIzq()==null && nodo.getDer()==null)
		   return true;
	   else
		   return false;
}

   public boolean estaCompleto() {
	   int aux = altura();
	   
	   if(cantNodos()== Math.pow(2,aux)-1)
		   return true;
	   return false;
   }
   
private String toStringPreorden(Nodo<T> nodo) {
	  // TODO Auto-generated method stub
	  StringBuilder sb = new StringBuilder();
	  if (nodo!=null) {
		  sb.append(nodo.getInfo()).append(" ");
		  sb.append( toStringPreorden(nodo.getIzq()) );
		  sb.append( toStringPreorden(nodo.getDer()) );
	  }
	  return sb.toString();
  	}

	
	public int ramaMasCorta() {
		return ramaMasCorta(raiz);
	}


	private int ramaMasCorta(Nodo<T> nodo) {
		if (nodo==null)
			return 0;
		else
			return 1 + Math.min(ramaMasCorta(nodo.getIzq()), ramaMasCorta(nodo.getDer()));
	}

	public static void main(String[]args) {
		AB<Integer> arbolito = new AB<Integer>();

		arbolito.agregar(8);
		arbolito.agregar(2);
		arbolito.agregar(3);
		arbolito.agregar(4);
		arbolito.agregar(1);
		arbolito.agregar(6);
		
		
		//System.out.println(arbolito.toString());
		//System.out.println(arbolito.estaBalanceado());
		//arbolito.balanceo();
		//System.out.println(arbolito.toString());
		//System.out.println(arbolito.estaBalanceado());
	}
}
