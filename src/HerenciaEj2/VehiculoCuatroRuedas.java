package HerenciaEj2;

import java.awt.Point;

public abstract class VehiculoCuatroRuedas extends Vehiculo{
	private Point posicion;
	private String marca;
	
	public VehiculoCuatroRuedas(String n) {
		marca=n;
		posicion = new Point(0,0);
	}
		
	public  int cantidadRuedas() {
		return 4;
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
