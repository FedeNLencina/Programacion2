package HerenciaFiguras;

public class Circulo extends Figura {

	private int radio;
	
	public Circulo (int r) {
		super();//esto no es necesario ya que como no tiene atributos, este lo crea vacio
		radio = r;
	}
	
	
	public double area() {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	
	public double perimetro() {
		double perimetro = 2*Math.PI*radio;
		return perimetro;
	}
}

