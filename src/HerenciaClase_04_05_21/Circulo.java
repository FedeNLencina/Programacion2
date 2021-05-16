package HerenciaClase_04_05_21;

public class Circulo extends Figura {
	double radio;
	public Circulo(double r) {
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * Math.PI;
	}

	@Override
	public double perimetro() {
		return radio * 2 * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circulo con radio " + radio; 
	}

}
