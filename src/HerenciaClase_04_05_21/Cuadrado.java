package HerenciaClase_04_05_21;

public class Cuadrado extends Rectangulo {
	public Cuadrado(double l) {
		super(l,l);
	}
	
	public String toString(){
		return "Cuadrado de lado " + getBase();
	}

}
