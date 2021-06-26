package ArbolBinarioClase;

import java.util.LinkedList;
import java.util.List;

public class ABB<T extends Comparable<T>> extends AB<T> {
	
	protected void agregar(Nodo<T> nodo, Nodo<T> nuevo) {
		if (nuevo.getInfo().compareTo(nodo.getInfo()) < 0)
			if (nodo.getIzq()==null)
				nodo.setIzq(nuevo);
			else
				agregar(nodo.getIzq(), nuevo);
		else if (nuevo.getInfo().compareTo(nodo.getInfo()) > 0)
			if (nodo.getDer()==null)
				nodo.setDer(nuevo);
			else
				agregar(nodo.getDer(), nuevo);
	}

	protected boolean pertenece(Nodo<T> nodo, T elem) {
		if (nodo==null)
			return false;
		if (nodo.getInfo().equals(elem))
			return true;
		if (elem.compareTo(nodo.getInfo()) < 0)
			return pertenece(nodo.getIzq(),elem);
		else
			return pertenece(nodo.getDer(),elem);
	}
	
	// Métodos de tarea para implementar
	// ---------------------------------
	// ¡Usar irep de ABB!

	// Retorna el nivel en el que está el elemento.
	// Si no está, retorna -1
	public int nivel(T elem) {
		if(!buscar(elem))
			return -1;
		return nivel(elem,raiz);
	}
	
	private int nivel(T elem,Nodo<T> nodo) {
		if(nodo.getInfo().equals(elem))
			return 1;
		if(nodo.getInfo().compareTo(elem)<0)
			return 1 + nivel(elem,nodo.getIzq());
		else
			return 1 + nivel(elem,nodo.getDer());
	}

	// Retorna el elemento mínimo del árbol
	public T minimo() {
		if (raiz==null)
			return null;
		else
			return minimo(raiz);
	}

	private T minimo(Nodo<T> nodo) {
		if(nodo.getIzq()==null)
			return nodo.getInfo();
		else
			return minimo(nodo.getIzq());
	}
	@Override
	protected boolean buscar(T elem, Nodo<T> nodo) {
		if(nodo==null)
			return false;
		
		if(elem.equals(nodo.getInfo()))
			return true;
		
		//llamada recursiva
		if(elem.compareTo(nodo.getInfo()) < 0 )
			return buscar(elem, nodo.getIzq());
		
		return buscar(elem, nodo.getDer());
	}

	// Dados dos elementos devuelve los valores de los nodos
		// que hay entre ellos (incluidos los bordes)
		// o {} si alguno no pertenece
		// x ej 
		// unABB.elemsEntre(1, 5) = {12345}
	public String elemsEntre(T elem1, T elem2) {
		StringBuilder sb = new StringBuilder("{");
		if (pertenece(elem1)&&pertenece(elem2))
			if (elem1.compareTo(elem2)>0)
				sb.append(elemsEntre(elem2,elem1,raiz));
			else
				sb.append(elemsEntre(elem1,elem2,raiz));
		sb.append("}");
		return sb.toString();
	}
	
		// Dados dos elementos devuelve la cantidad de nodos del camino de ir de un
		// elemento hasta la raiz y de alli al otro elemento, SIN contar los bordes
		// si alguno de los elementos no pertenece devuelve 0
		// si elem1==elem2 retornar 0
		//se resuelve usando nivel
		public int elemsPasandoPorRaiz(T elem1, T elem2) {
			return 0;
		}

	private String elemsEntre(T elem1, T elem2, Nodo<T> nodo) {
		if (nodo==null)
			return "";
		StringBuilder sb = new StringBuilder();
		if (elem1.compareTo(nodo.getInfo())<0)
			sb.append( elemsEntre(elem1,elem2,nodo.getIzq()) );
		if (elem1.compareTo(nodo.getInfo())<=0
			&& elem2.compareTo(nodo.getInfo())>=0)
			sb.append(nodo.getInfo()).append(" ");
		if (elem2.compareTo(nodo.getInfo())>0)
			sb.append( elemsEntre(elem1,elem2,nodo.getDer()) );
		return sb.toString();
	}
	
	public void balanceo() {
		if(!estaBalanceado() && raiz!= null) {
			List<T> lista = elemsEnLista();	
			System.out.println(lista.toString());
			raiz = null;
			balanceo(raiz,lista, (lista.size()-1)/2);
		}
	}

	private void balanceo(Nodo<T> nodo,List<T> lista,int indice) {
		System.out.println(indice);
		System.out.println(lista.get(indice));
		
		if(indice==0) {
			agregar(lista.get(indice));
		}
			
		else {
			agregar(lista.get(indice));
			System.out.println(nodo.getInfo());
			int hasta= lista.size()-1;
			int medio = hasta/2;
			System.out.println(nodo.getInfo());
			balanceo(nodo.getIzq(),lista,(medio/2)/2);
			balanceo(nodo.getDer(),lista,(hasta-medio));
		}
	}
	
	public List<T> elemsEnLista(){
		List<T> lista = new LinkedList<T>();
		if(raiz == null)
			return lista;
		elemsEnLista(raiz, lista);
		return lista;
}

	private void elemsEnLista(Nodo<T> nodo, List<T> lista) {
		if(nodo != null) {
			elemsEnLista(nodo.getIzq(), lista);
			lista.add(nodo.getInfo());
			elemsEnLista(nodo.getDer(), lista);
		}
	}
	
	//metodo que hizo Agustin.
//	public void balanceo() {
//        if(!estaBalanceado()) {
//            List<T> aux = elemsEnLista();
//            raiz = null;
//            balanceo( aux );
//        }
//    }
//
//    private void balanceo( List<T> lista) {
//        List<T> menor = lista.subList(0, lista.size()/2);
//        List<T> mayor = lista.subList(lista.size()/2,lista.size());
//        //caso base
//        if(lista.size()==1) {
//            System.out.println(lista.get(lista.size()/2));
//            agregar(lista.get(lista.size()/2));
//        }
//        //recursividad
//        if(lista.size()>1) {
//            //agrego el del medio
//            System.out.println(lista.get(lista.size()/2));
//            agregar(lista.get(lista.size()/2));
//            balanceo(menor);
//            balanceo(mayor);
//        }
//
//    }
	public T maximaHoja() {
		if(raiz==null)
			return null;
		return maximaHoja(raiz);
	}
	
	private T maximaHoja(Nodo<T> nodo) {
		if(esHoja(nodo))
			return nodo.getInfo();
		if(nodo.getDer()!=null) 
			return maximaHoja(nodo.getDer());
		else
			return maximaHoja(nodo.getIzq());
	}

	public static void main(String[]args) {
		ABB<Integer> abbint2 = new ABB<Integer>();

		abbint2.agregar(4);
		abbint2.agregar(2);
		abbint2.agregar(8);
		abbint2.agregar(1);
		abbint2.agregar(3);
		abbint2.agregar(7);
		abbint2.agregar(9);
		abbint2.agregar(6);
		abbint2.agregar(5);
		
		//System.out.println(arbolito.elemsEnLista());
		System.out.println(abbint2.maximaHoja());
	}
}
