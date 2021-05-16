package HerenciaFiguras;


public class Triangulo extends Figura{

	private int lado1;
	private int lado2;
	private int lado3;
	
	
	public Triangulo(int a, int b, int c) {
		super();
		lado1=a;
		lado2=b;
		lado3=c;
	}
	
	public double area() {
		//se calcula el semiperimeto ya que el area se calcula con este. Semiperimetro = s
		double s = (lado1 + lado2 + lado3)/2;
		double radicando = s*(s-lado1)*(s-lado2)*(s-lado3);
		double area = Math.sqrt(radicando);
		
		return area;
	}
	
	public double perimetro() {
		double perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
}
