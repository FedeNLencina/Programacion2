package InterfacesClase06_05_21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Polimorfismo {

	public static void main(String[] args) {
		
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		
//		Tanto el ArrayList como el HashSet implementaron la interface Iterable,
//		por lo tanto, ambas clases entienden el mismo mensaje "iterator()"
//
		HashSet<Integer> ar = new HashSet<Integer>();

		ar.add(15);
		ar.add(20);
		ar.add(32);
		ar.add(14);
		
		Iterator<Integer> ita = ar.iterator();
		while (ita.hasNext())
			System.out.println(ita.next());
		

	}

}
