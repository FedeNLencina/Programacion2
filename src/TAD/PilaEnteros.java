package TAD;

import java.util.LinkedList;

public class PilaEnteros {
	private LinkedList <Integer> elementos; //si no le asigno un valor en el constructor es null
	
	public PilaEnteros() {
		this.elementos = new LinkedList <Integer>(); //si pongo solo this.pila ya deja de ser null
	}

	public void apilar(Integer numero) {
		elementos.add(numero);
	}
	
	public Integer desapilar() {
		return elementos.removeLast();
	}
	
	public Integer tope() {
		return elementos.getLast();
		
	}
	
	public boolean esVacia() {
		return elementos.isEmpty();
	}
	
	public int getTamaño() {
		return elementos.size();
	}
}
