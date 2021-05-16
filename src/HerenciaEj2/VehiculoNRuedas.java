package HerenciaEj2;

import java.awt.Point;

public abstract class VehiculoNRuedas extends Vehiculo {
	private Point posicion;
	private int ruedas;
	private String marca;
	
	public VehiculoNRuedas(int r, String n) {
		ruedas=r;
		marca=n;
		posicion = new Point(0,0);
	}
	
	public  int cantidadRuedas() {
		return ruedas;
	}
	
	public String nombre() {
		return marca;
	}
	
	public void mover(int distancia) {
		if(distancia<0)
			posicion.x =(int) (posicion.getX() - distancia);
		else
			posicion.x =(int) (posicion.getX() + distancia);
	}
	
	public Point posicion() {
		return posicion;
	}
	public String toString() {
		return super.toString();
	}
}
