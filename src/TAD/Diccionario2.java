package TAD;

import java.util.stream.Collectors;

public class Diccionario2<C,V> {

	// TAREA: implementar las operaciones basicas
	//        utilizando esta representacion

	private Conjunto<TuplaDicc<C,V>> entradas;
	
	public Diccionario2() {
		entradas= new Conjunto<TuplaDicc<C,V>>();
	}
	
	public boolean estaDefinida(C clave) {
		boolean dentro = false;
		for( TuplaDicc<C,V> entrada : entradas.getConj() ) {
			dentro = dentro || entrada.getX().equals(clave);
		}
		return dentro;
	}
	
	public void definir(C clave, V valor) {
		if(!estaDefinida(clave)) {
			entradas.agregar(new TuplaDicc<C,V>(clave,valor));
		}
		else {
			for(TuplaDicc<C,V> entrada: entradas.getConj()) {
				if(entrada.getX().equals(clave))
					entrada.setY(valor);
			}
		}
	}
	
	public V definicion(C clave) {
		if(estaDefinida(clave)) {
			for(TuplaDicc<C,V> entrada: entradas.getConj()) {
				if(entrada.getX().equals(clave)) {
					return entrada.getY();
				}
			}
		}
		return null;
	}
	
	public int tamanio() {
		return entradas.tamanio();
	}
	
	public boolean esVacio() {
		return tamanio()==0;
	}
	
	public Conjunto<C> claves(){
		Conjunto<C> clavesDic = new Conjunto<C>();
		for (TuplaDicc<C,V> entrada : entradas.getConj()) {
			clavesDic.agregar(entrada.getX());
		}
		return clavesDic;
	}
	
	public boolean eliminar(C clave) {
	for (TuplaDicc<C,V> entrada : entradas.getConj()) {
		if(entrada.getX().equals(clave)){
				return entradas.getConj().remove(entrada);
		}
	}
	return false;
}

	
	
	public static void main(String [] args) {
		Diccionario2<String, Integer> dic = new Diccionario2<String, Integer>();
		
	}
}
