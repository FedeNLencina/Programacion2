package HerenciaFiguras;

public abstract class Figura {
//La hago abstracta ya que es una categoria que engloba las figuras,nunca voy a crear instancias de figura.
	
	
	public abstract double area(); 
	public abstract double perimetro();
	
	public String toString() {
		return getClass() + " con area " + area() + " y perimetro " + perimetro();
	}
	
}
