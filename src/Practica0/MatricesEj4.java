package Practica0;

public class MatricesEj4 {

	public static boolean mayorDiversidad(int[][] mtx) {
		boolean orden = true;
		boolean par= false;
		boolean impar= false;
		boolean noVacio= false;
		boolean mismaLongitud= true;
		for (int fila=0; fila<mtx.length; fila++) {
			noVacio=true;
			for (int col= 0;col<mtx[fila].length-1; col++) {
				int longFilActual= mtx[fila].length;
				int longFilSig= mtx[fila+1].length;
				mismaLongitud= mismaLongitud && (longFilActual==longFilSig);
				int actual = mtx[fila][col];
				int siguiente = mtx[fila][col+1];
				orden = orden && actual<siguiente;
				par = par || (actual%2==0); 
				impar= impar || (actual%2!=0);
			}
		}
		return orden && par && impar && noVacio && mismaLongitud;
	}

}
