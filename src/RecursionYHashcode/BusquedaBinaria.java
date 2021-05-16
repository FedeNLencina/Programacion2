package RecursionYHashcode;

public class BusquedaBinaria {
		
	public static int busquedaBin(int []arr, int elem) {
		return busquedaBin(arr,elem,0, arr.length -1);
	}
	
	private static int busquedaBin(int[] arr,int numeroBuscado, int desde, int hasta) {
		if(desde>hasta)
			return -1; // caso base 1: no se encontro
		int medio= (desde + hasta)/2;
		if(arr[medio]== numeroBuscado)
			return medio; //caso base 2: se encontro en la pos medio
		if(arr[medio]<numeroBuscado)
			//llamada recursiva: el nro es mayor, se busca a la derech
			return busquedaBin(arr,numeroBuscado, medio+1, hasta);
		else
			//llamada recursiva: el nro es menor, se busca a la izquierda
			return busquedaBin(arr,numeroBuscado, medio+1, hasta);
	}
}
	
