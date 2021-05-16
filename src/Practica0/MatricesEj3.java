package Practica0;

public class MatricesEj3 {
	
	public static boolean algunaFilaTodosNegativos (int [] [] mat) {
		
		boolean fila = false;
		for (int fil =0; fil< mat.length; fil++) {
			boolean negativo = true;  //se inicializa el acumulador antes de que recorra cada fila.
			for (int col = 0; col< mat[fil].length; col++) {
				negativo = negativo && mat[fil][col]<0;
			}
			fila= fila || negativo;
		}
		return fila;
	}

	//si en lugar de retornar true si alguna fila tienen todos negativos, ejercicio 3 de practica0 seria invertir los acumuladores
	//armar un junit para probar esto
	public static boolean algunNegativo (int [] [] mat) {
		boolean fila = true;
		for (int fil =0; fil< mat.length; fil++) {
			boolean negativo = false;  //se inicializa el acumulador antes de que recorra cada fila.
			for (int col = 0; col< mat[fil].length; col++) {
				negativo = negativo && mat[fil][col]<0;
			}
			fila= fila && negativo;
		}
		return fila;
	}
	

}
