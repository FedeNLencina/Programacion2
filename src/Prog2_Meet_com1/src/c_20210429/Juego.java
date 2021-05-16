package Prog2_Meet_com1.src.c_20210429;

import java.util.ArrayList;

public class Juego {
	private ArrayList<ObjetoGrafico> objetos;
	
	public Juego() {
		objetos = new ArrayList<ObjetoGrafico>();
		objetos.add(new Nave(40,20,3,90));
		objetos.add(new Nave(50,30,4,180,15));
		objetos.add(new Asteroide(10,15,1,90));
		objetos.add(new Asteroide(20,25,2,180));
		objetos.add(new Asteroide(1,-90));
	}

	public void ciclo() {
		for (ObjetoGrafico og: objetos) {
			System.out.println(og);
			og.mover();
		}
	}
	

}
