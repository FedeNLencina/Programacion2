package Practica0;

public class TieneNegativos {

	public static boolean tieneNegativos(int[][] mat) {
		boolean tieneNegativos=true;
		for(int fil= 0;fil<mat.length;fil++) {
			boolean algunaFilaNegativa = false;
			for(int col= 0; col<mat[fil].length;col++) {
				algunaFilaNegativa= algunaFilaNegativa || mat[fil][col]<0;
			}
		tieneNegativos= tieneNegativos && algunaFilaNegativa;
		}
		return tieneNegativos;
	}
}
