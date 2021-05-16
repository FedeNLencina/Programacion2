package HerenciaFiguras;

public class Rectangulo extends Figura{

	private int base;
	private int altura;
	
	public Rectangulo (int b, int a) {
		super();
		base=b;
		altura=a;
	}
	
	public double area() {
		double area = base*altura;
		return area;
	}
	
	public double perimetro() {
		double perimetro = Math.pow(altura, 2) + Math.pow(base, 2);
		return perimetro;
	}
}
