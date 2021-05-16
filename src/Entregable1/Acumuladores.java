package Entregable1;

public class Acumuladores {
	/*
	Consigna Tarea 1:
	Resolver con Acumuladores Booleanos
	Subir los archivos .java a la tarea de moodle
	*/

	// devuelve verdadero si todos los elementos de mat son pares
	static public boolean todosPares(int[][] mat) {
		// completar y cambiar el valor de retorno
		boolean pares=true;
		for(int fil=0; fil<mat.length; fil++) {
			for(int col=0; col< mat[fil].length; col++) {
				int elementoActual= mat[fil][col];
				pares= pares && (elementoActual%2==0);
			}
		}
		return pares;
	}


	//devuelve verdadero si todos los elementos de alguna fila de mat son pares
	static public boolean algunaFilaPar(int[][] mat) {
		// completar y cambiar el valor de retorno
		boolean algunaPar=false;
		for(int fil=0; fil<mat.length; fil++) {
			boolean pares=true;
			for(int col=0; col< mat[fil].length; col++) {
				int elementoActual= mat[fil][col];
				pares= pares && (elementoActual%2==0);
			}
			algunaPar= algunaPar || pares;
		}
		return algunaPar;
		
	}

	//devuelve verdadero si alguna fila de mat suma menos que 30
	static public boolean algunaFilaSumaMenosQue30(int[][] mat) {
		// completar y cambiar el valor de retorno
		boolean algunaMenorA30=false;
		for(int fil=0; fil<mat.length; fil++) {
			int cont=0;
			for(int col=0; col< mat[fil].length; col++) {
				int elementoActual= mat[fil][col];
				cont+= elementoActual;
			}
			algunaMenorA30= algunaMenorA30 || (cont<30);
		}
		return algunaMenorA30;
	}

	//devuelve verdadero si alguna columna de mat suma mas que 50
	static public boolean algunaColSumaMasQue50(int[][] mat) {	
		// completar y cambiar el valor de retorno
		boolean algunaMayorA50=false;
		for(int col=0; col<mat[0].length; col++) {
			int cont=0;
			for(int fil=0; fil< mat.length; fil++) {
				int elementoActual= mat[fil][col];
				cont+= elementoActual;
			}
			algunaMayorA50= algunaMayorA50 || (cont<50);
		}
		return algunaMayorA50;
		
	}

	//devuelve verdadero si alguna fila es par y alguna columna suma mas que 50
	static public boolean algunaFilaParYColMasQue50(int[][] mat) {	
		// completar y cambiar el valor de retorno - Utilizar lo anterior
		boolean algunaPar= algunaFilaPar(mat);
		boolean colMayorA50= algunaColSumaMasQue50(mat);
		
		return algunaPar && colMayorA50;
	}
	
	// devuelve verdadero si alguna fila de mat es igual a lista.
	// Lista tiene tantos elementos como las columnas de mat
	static public boolean algunaFilaIgualLista(int[][] mat, int[] lista) {
		// completar y cambiar el valor de retorno
		boolean algunaIgual= false;
		for(int fil=0; fil<mat.length; fil++) {
			boolean igual= true;
			for(int col=0; col< mat[fil].length; col++) {
				int elementoActual= mat[fil][col];
				int elementoLista= lista[col];
				igual = igual && (elementoActual == elementoLista); 
			}
			algunaIgual = algunaIgual || igual;
		}
		return algunaIgual;
	}


	public static void imprimirPorFilas(int[][] m) {
		for(int fil=0; fil < m.length; fil++) {
			
			for(int col=0; col < m[fil].length; col++)
				System.out.print(m[fil][col] + " ");
		
			System.out.println();
		}
	}
	
	public static void imprimirPorColumnas(int[][] m) {
		for(int col=0; col < m[0].length; col++) {
			
			for(int fil=0; fil < m.length; fil++) 
				System.out.print(m[fil][col] + " ");
		
			System.out.println();
		}
	}
	
	public static void imprimirLista(int[] l) {
		for(int i=0; i < l.length; i++) 
			System.out.print(l[i] + " ");
	}


}
