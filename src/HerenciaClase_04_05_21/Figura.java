package HerenciaClase_04_05_21;

public abstract class Figura {
	abstract double area();
	abstract double perimetro();
	public String toString(){
		return getClass().getSimpleName()+ " con area "+area()+" y perimetro "+perimetro();
	}
}

