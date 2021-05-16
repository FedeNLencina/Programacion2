package Practica0;

public class SubconjuntoEj2 {

	//Implementar una función que determine si un arreglo es subconjunto de otro
	
	public static boolean pertenecenTodos(int[] elems, int[] arreglo) {
		boolean esSubconjunto=true;
		boolean arregloNoContieneElem=true;
		boolean elemsVacios=true;
		for(int j =0; j <elems.length; j++) {
			int elemento=elems[j];
			arregloNoContieneElem=false;
			boolean esElemento=false;
			for(int i=0; i< arreglo.length; i++) {
				arregloNoContieneElem=true;
				int actual=arreglo[i];
				esElemento= esElemento || elemento==actual;	
			}
			esSubconjunto= esSubconjunto && esElemento;
		}
		return esSubconjunto && arregloNoContieneElem && elemsVacios;
	}
	


	public static void main (String [] args) {
		int [] listaA = {11};
		int [] listaB = {11,20,30};
		boolean pertenece= pertenecenTodos(listaA, listaB);
		
		System.out.println("La lista A es un subconjunto de la Lista B " + pertenece);
	}
	
	
}
