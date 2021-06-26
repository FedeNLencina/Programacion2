package ArbolBinario;

public class Nodo<T> {
		private T info;
		private Nodo <T> izq;
		private Nodo <T> der;
		
		public Nodo(T dato) {
			info = dato;
			
		}
		//se generan los get y set para poder crear nodos hijos.
		public Nodo<T> getIzq() {
			return izq;
		}

		public T getInfo() {
			return info;
		}
		
		public void setInfo(T info) {
			this.info = info;
		}
		
		public void setIzq(Nodo<T> izq) {
			this.izq = izq;
		}

		public Nodo<T> getDer() {
			return der;
		}

		public void setDer(Nodo<T> der) {
			this.der = der;
		}
		
		@Override
		public String toString() {
			return  info.toString(); //info es un objeto de T y siempre hereda el toString() de objetc
		}
		
		
}
