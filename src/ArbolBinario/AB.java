package ArbolBinario;

public class AB<T> {
	private Nodo<T> raiz;
	
	
	public AB() {
		raiz= null;
	}
	
	//Este constructor no se usa.
	/*public AB(T dato) {
		raiz = new Nodo<T> (dato);	
	}
	*/
	
	public void agregar(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		if(raiz == null)
			raiz = nuevo;
		else
			agregar(raiz,nuevo);
	}
	
	//este metodo es el recursivo, lo que hago es crear un hijo que sea un padre. En este caso pregunto por los hijos del nodo por el caso base.
	private void agregar(Nodo<T> padre, Nodo<T> nuevo) {
		if (padre.getIzq()==null)//caso base1
			padre.setIzq(nuevo);//seteo el hijo en el izq
		else if(padre.getDer()==null)//caso base2
			padre.setDer(nuevo);//seteo el hijo en el derecho
		else //llamo a la recursividad eligiendo arbitrariamente a que nodo hijo llamar agregar.
			 //el arbol se construye a la izquierda
			 agregar(padre.getIzq(),nuevo);
	}
	
	public int altura() {
		return altura(raiz);
	}

	private int altura(Nodo<T> nodo) { //metodo recursivo
		if(nodo==null) //este if en el metodo principal no lo agrego ya que si entra en la recursion lo evaluo, es evaluar de mas esa condicion.
			return 0;
		else
			return 1+ Math.max(altura(nodo.getDer()),altura(nodo.getIzq()));
	}
	
	
	//tarea para el jueves 
	//metodo que retorna la cant nodos
	public int cantNodos() {
		if(raiz==null)
			return 1;
		else
			return 1 +  cantidadHijos(raiz);
	}

	private int cantidadHijos(Nodo<T> nodo) {
		if (nodo.getDer()==null && nodo.getIzq()==null)
			return 2;
		
		if(nodo.getDer()==null)
			return 2 + cantidadHijos(nodo.getIzq());
		
		if(nodo.getIzq()==null)
			return 2 + cantidadHijos(nodo.getDer());
	
		else
			return 2 + cantidadHijos(nodo.getIzq()) + cantidadHijos(nodo.getDer());
	}
	
	public int cantidadNodos(){
		return (raiz == null) ? 0 : cantidadNodos(raiz);
		}
	
		private int cantidadNodos(Nodo<T> nodo){
		int cantIzq = (nodo.getIzq() == null) ? 0 : cantidadNodos(nodo.getIzq()) ;
		int cantDer = (nodo.getDer() == null) ? 0 : cantidadNodos(nodo.getDer()) ;
		return 1 + cantIzq + cantDer;
		}
		
	public boolean pertenece (T elem) {
		return pertenece(raiz,elem);
	}
	
	private boolean pertenece(Nodo<T>nodo, T elem) {
		if(nodo==null)
			return false;
		if(nodo.getInfo().equals(elem))
			return true;
		return pertenece(nodo.getIzq(),elem) || pertenece(nodo.getDer(),elem);
	}
	
}
