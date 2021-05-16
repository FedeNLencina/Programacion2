package HerenciaEj2;

import java.awt.Point;

public abstract class Vehiculo {
	
	
	public abstract int cantidadRuedas();
	public abstract String nombre();
	public abstract void mover(int distancia);
	public abstract Point posicion();
	
	public String toString() {
		return getClass().getSimpleName();
	}
	
}
