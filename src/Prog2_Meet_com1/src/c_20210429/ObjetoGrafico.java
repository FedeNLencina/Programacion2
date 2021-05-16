package Prog2_Meet_com1.src.c_20210429;

import java.awt.Point;

public abstract class ObjetoGrafico {
	private Point posicion;
	private int velocidad;
	private int angulo;
	
	public ObjetoGrafico(int x, int y, int v, int a) {
		posicion = new Point(x,y);
		velocidad = v;
		angulo = a;
	}
	
	public abstract void dibujar();
	
	public void mover() {
		System.out.println("Mover de ObjetoGrafico");
	}

	public void chocar(ObjetoGrafico o) {
		
	}
	
	public int posX(){
		return posicion.x;
	}
	
	public String toString() {
		return "Posicion "+posicion;
	};

}
