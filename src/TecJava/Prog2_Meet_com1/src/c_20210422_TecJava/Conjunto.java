package TecJava.Prog2_Meet_com1.src.c_20210422_TecJava;

import java.util.ArrayList;

public class Conjunto<T> {
	private ArrayList<T> conj;
	private int indice;
/*
 * IREP:
 * 
 * Para todo par de enteros 0<= i != j < conj.length
 *   conj.get(i).equals( conj.get(j) ) = false
 * 
 * indice >= 0 && indice <= conj.length
 * 
 * 
 */
	
	public Conjunto() {
		conj = new ArrayList<T>();
		indice = 0;
	}
	
	public boolean pertenece(T elem){
		return conj.contains(elem);
	}
	
	public boolean agregar(T elem) {
		//if (pertenece(elem))
			//return false;
		return conj.add(elem);
	}
	
	public boolean quitar(T elem) {
		boolean elim = conj.remove(elem);
		if (indice>tamanio())
			indice = tamanio();
		return elim;
	}
	
	public boolean esVacio() {
		return tamanio()==0;
	}
	
	public int tamanio() {
		return conj.size();
	}
	
	public T dameUno() {
		if (esVacio())
			return null;
		if (indice==tamanio()) 
			indice = 0;
		return conj.get(indice++);
	}
	
	// La unión queda en el conjunto this
	// (es destructiva)
	public void union(Conjunto<T> otroConj) {
		for (int i = 0; i < otroConj  .tamanio(); i++)
			this.agregar(otroConj.dameUno());
	}

	// La unión queda en el retorno del método
	// no destructiva (el this queda sin cambios)
	public Conjunto<T> union2(Conjunto<T> otroConj) {
		Conjunto<T> ret = new Conjunto<T>();
		ret.union(this);
		ret.union(otroConj);
		return ret;
	}

	// PENDIENTE DE IMPLEMENTAR:
	// -------------------------
	// usar solo las operaciones basicas ya definidas


	// La intersección quedará en el conjunto this
	// destructiva
	public void interseccion(Conjunto<T> otroConj) {
		for(int i = 0; i< otroConj.tamanio(); i++) {
			T elemActual= otroConj.dameUno();
			if(!this.pertenece(elemActual)) {
				this.quitar(elemActual);
			}
		}
	}

	// La intersección queda en el retorno del método
	// no destructiva (el this queda sin cambios)
	public Conjunto<T> interseccion2(Conjunto<T> otroConj) {
		Conjunto<T> nuevo = new Conjunto<T>();
		nuevo.union(this);
		nuevo.interseccion(otroConj);
		return nuevo;
	}

	public ArrayList<T> getConj() {
		return conj;
	}

	public void setConj(ArrayList<T> conj) {
		this.conj = conj;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i< this.tamanio(); i++) {
			s.append(this.dameUno());
		}
		String nuevo = s.toString();
		return nuevo;
	}
	
	public String toString2() {
		String s = "";
		for (int i = 0; i< this.tamanio(); i++) {
			s= s+ (this.dameUno().toString());
		}
		return s;
	}
	
	public static void main (String [] args) {
		Conjunto <Integer> conjunto = new Conjunto<Integer>();
		for(int i = 0; i<200000; i++) {
			conjunto.agregar(1);
		}
		
		Conjunto <Integer> conjunto2 = new Conjunto<Integer>();
		for(int i = 0; i<200000; i++) {
			conjunto.agregar(1);
		}
		
		long inicio = System.currentTimeMillis();
		String cadenaConjunto = conjunto.toString2();
		long total = System.currentTimeMillis() - inicio;
		//System.out.println(cadenaConjunto);
		System.out.println(total);
		
		long inicio2 = System.currentTimeMillis();
		String cadenaConjunto2 = conjunto2.toString();
		long total2 = System.currentTimeMillis() - inicio2;
		//System.out.println(cadenaConjunto2);
		System.out.println(total2);
		
		
	}
}
