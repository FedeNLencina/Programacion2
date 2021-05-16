package TAD;

import java.util.LinkedList;

public class Pila<T> {  //con esto lo hago generico a la pila con los < T >

	private LinkedList <T> elementos; //si no le asigno un valor en el constructor es null
	
	public Pila() {
		this.elementos = new LinkedList <>(); //si pongo solo this.pila ya deja de ser null
	}

	public void apilar(T numero) {
		elementos.add(numero);
	}
	
	/*public Integer desapilar() {
		return elementos.removeLast(); //esto da error porque es un metodo que devuelve un ointeger 
	}*/									//ahora si le pongo un metodo que devuelve el tipo T no da error
	public T desapilar() {
		return elementos.removeLast();
	}
	
	public T tope() {
		return elementos.getLast();
		
	}
	
	public boolean esVacia() {
		return elementos.isEmpty();
	}
	
	public int getTamaño() {
		return elementos.size();
	}
}
