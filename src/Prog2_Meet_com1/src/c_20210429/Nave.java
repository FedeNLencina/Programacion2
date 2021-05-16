package Prog2_Meet_com1.src.c_20210429;

public class Nave extends ObjetoGrafico {
	private int energia;
	
	public Nave(int x, int y, int v, int a, int e) {
		super(x, y, v, a);
		energia = e;
	}

	public Nave(int x, int y, int v, int a) {
		super(x, y, v, a);
		energia = 10;
	}

	public void disparar() {
		
	}
	public void girar() {
		
	}
	public void mover() {
		System.out.println("Mover de Nave");
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " - Nave con energia "+energia;
	}
	

}
