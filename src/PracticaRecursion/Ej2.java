package PracticaRecursion;

public class Ej2 {

	public static int minimo(int [] array) {
		if(array.length>0)
			return minimo(array,0,array[0]);
		else
			throw new RuntimeException("El arreglo no contiene elementos.");	
			
	}

	private static int minimo(int[] array, int i,int valor) {
		int minimo=valor;
		if(i==array.length)
			return minimo;
		
		else if(minimo>array[i]) {
			minimo=array[i];
			return minimo(array,i+1,minimo);
		}
		else	
			return minimo(array,i+1,minimo);
	}
	
	public static int minimo2(int [] array) {
		if(array.length>0)
			return minimo2(array,0);
		else
			throw new RuntimeException("El arreglo no contiene elementos.");	
			
	}

	private static int minimo2(int[] array, int i) {
		if(i==array.length-1)
			return array[i];
		else 
			return Math.min(array[i], minimo2(array,i+1));
	}	
	
	public static void main (String [] args) {
		int [] array= {3,5,1};
		System.out.println(minimo(array));
		System.out.println(minimo2(array));
	}
	
	
	
}
