package PracticaRecursion;

public class Ej1 {

	public static void main (String [] args) {
		int [] array= {1,2,5,6};
		System.out.println(suma(array));
		
	}

	public static int suma(int[] array) {
		
		return suma(array,0);
	}

	private static int suma(int []array, int i) {
		if(i==array.length)
			return 0;
		else
				return array[i] + suma(array,i+1);
	}
}
