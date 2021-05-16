package InterfacesClase06_05_21;

import java.util.ArrayList;

public class ListaOrdenada<T extends Comparable<T>> {

	// IREP: Para todo entero i entre 0 y datos.size()-2, se verifica que:
	//            datos.get(i).compareTo(datos.get(i+1)) <= 0
	private ArrayList<T> datos;
	
	public ListaOrdenada() {
		datos = new ArrayList<T>();
	}

	// Inserta elem de manera que el ArrayList datos
	// quede siempre ordenado de menor a mayor
	public void agregar(T elem) {
		int i = 0;
		while (i<datos.size() && elem.compareTo(datos.get(i))>0)
			i++;
		datos.add(i, elem);
	}

	@Override
	public String toString() {
		return "ListaOrdenada [datos=" + datos + "]";
	}

}
