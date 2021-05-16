package Parcial1;

public class ejercicioAcumBool {
	
	//c es un numero de columna
	public static boolean existeColumnaMultiplol(int[ ][ ] mat, int k, int c) {
		boolean matEsVacia = false;
		boolean existeColumna = false;
		
		for(int col=0; col< mat[0].length; col++) {
			matEsVacia = true;
			boolean esIgual=true;
			for(int fil=0; fil<mat.length; fil++) {
				esIgual= esIgual && (mat[fil][col]== mat[fil][c]*k);
			}
			existeColumna= existeColumna || esIgual;
		}
		return existeColumna && matEsVacia;
	}
	
	
	public static void main(String[] args) {
	
		int mat [][] =  {{1,9,6,2}, {9,12,18,18}, {15,14,9,30}, {11,21,28,22}};
		boolean existeColumnaMultiplol= existeColumnaMultiplol(mat, 3, 1);
		System.out.println(existeColumnaMultiplol);
	}
}
	
