package Matrices;

public class Matrices_y_AcumBool {

	public static void main(String[] args) {
		//--------------------------------------------------------------------
		//   MATRICES
		// -------------------------------------------------------------------
		
		int[][] m1 = {{ 5, 5, 5, 5 }, { 2, 6, 8, 10 }, { 8, 1, 1, 15 }};
		int[][] m2 = {{ 1, 8, 8 }, { 8, 0, 66 }, { 15, 9, 25 }, { 5, 5, 5 }};
		
		int[][] m3 = new int[3][4];
		
		for (int i=0; i<m3.length; i++) {
			for (int j=0; j<m3[0].length; j++) {
				m3[i][j]=i*j;
			}	
		}
		
		mostrarMatrizPorFilas(m1);
		System.out.println();
		mostrarMatrizPorColumnas(m1);
		System.out.println();
		mostrarMatrizPorFilas(m3);
	}


//EJEMPLOS CON MATRICES  ******************************************

	static void mostrarMatrizPorFilas(int[][] mat) {

		for(int fil=0; fil < mat.length; fil++) {
		
			for(int col=0; col < mat[fil].length; col++)
				System.out.print(mat[fil][col] + " ");
		
			System.out.println();
		}
	}

	static void mostrarMatrizPorColumnas(int[][] mat) {
		
		for(int col=0; col < mat[0].length; col++) {
		
			for(int fil=0; fil < mat.length; fil++) 
				System.out.print(mat[fil][col] + " ");
		
			System.out.println();
		}
	
	}

	// Programar una función que retorne TRUE,
	// cuando exista alguna fila donde
	// todos sus elementos son negativos
	
	public static boolean algunaFilaTodosNeg(int[][] mat) {
		boolean existeFila = false;
		boolean todosNeg;
		for (int fil=0; fil<mat.length; fil++) {
			todosNeg = true;
			for (int col=0; col<mat[fil].length; col++) {
				todosNeg = todosNeg && mat[fil][col]<0;
			}
			existeFila = existeFila || todosNeg;
		}
		return existeFila;
	}
	
}
