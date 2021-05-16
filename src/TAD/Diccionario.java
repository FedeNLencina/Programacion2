package TAD;

import java.util.ArrayList;

public class Diccionario<C,V> {
	private ArrayList<Tupla<C,V>> entradas;
	
	public Diccionario(){
		entradas = new ArrayList<Tupla<C,V>>();
	}

	public boolean estaDefinida(C clave){
		boolean ret = false;
		for (int i = 0; i < entradas.size(); i++)
			ret = ret || entradas.get(i).getX().equals(clave);
		
//      FOR EACH
//		for (Tupla<C,V>  entrada: this.entradas)
//			ret = ret || entrada.getX().equals(clave);
        
		return ret;
	}

	public void definir(C clave, V valor){
		if (!estaDefinida(clave))
			entradas.add(new Tupla<C,V>(clave, valor));
		else
			for (int i = 0; i < entradas.size(); i++)
				if (entradas.get(i).getX().equals(clave))
					entradas.get(i).setY(valor);
	}
	
	public V definicion(C clave) {
		for (int i = 0; i < entradas.size(); i++)
			if (entradas.get(i).getX().equals(clave))
				return entradas.get(i).getY();
		return null;
	}

	public int tamanio(){
		return entradas.size();
	}
	
	public boolean esVacio(){
		return tamanio()==0;
	}
	
	public boolean eliminar(C clave) {
		return entradas.remove(clave);
	}
	
	public Conjunto<C> claves() {
		Conjunto<C> clavesDiccionario = new Conjunto<C>();
		for (Tupla<C,V> entrada: this.entradas) {
			clavesDiccionario.agregar(entrada.getX());
		}
		return clavesDiccionario;
	}
}
