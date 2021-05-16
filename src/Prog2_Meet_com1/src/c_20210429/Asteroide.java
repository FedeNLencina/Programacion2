package Prog2_Meet_com1.src.c_20210429;

public class Asteroide extends ObjetoGrafico {

	public Asteroide(int x, int y, int v, int a) {
		super(x,y,v,a);
	}

	public Asteroide(int v, int a) {
		super(50,50,v,a);
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " - Asteroide";
	}

//	public void mover() {
//		System.out.println("Mover de Asteroide");
//	}

}
