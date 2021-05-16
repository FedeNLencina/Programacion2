package Practica0;

public class Practica0 {

	public Practica0() {
		// TODO Auto-generated constructor stub
	}
	
	//ejercicio1
	public static boolean esMayor10(int num) {
		if(num>10) {
			return true;
		}
		return false;
	}
	public static boolean mayor10(int[] lista){ 
		boolean mayor= true;
		for (int i =0; i<lista.length;i++) {
			mayor=mayor && esMayor10(lista[i]);
		}
		return mayor;
	}
	
	public static void main (String[]args) {
		int [] listaA = {11,20,30,10};
		boolean sonMayores= mayor10(listaA);
		System.out.println("Todos los elementos de la lista son mayores que 10: " + sonMayores);
	}
}
