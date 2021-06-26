package InterfacesClase06_05_21;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompararPersonas {

	
	public static void main(String arg[]) {
		
//		Set<Persona> conj = new HashSet<Persona>();
//		La linea anterior se puede remplazar por la siguiente, sin tocar el resto del codigo
//		Set<Persona> conj = new TreeSet<Persona>();
		
		Persona p1 = new Persona(74999999, "Jose");
		Persona p2 = new Persona(92759474, "Maria");
		Persona p3 = new Persona(74999999, "Juana");

//		conj.add(p1);
//		conj.add(p2);
//		conj.add(p3);
//		conj.add(new Persona(99888777,"XXX"));
//		System.out.println("Impresion del conjunto");
//		System.out.println(conj);
//		System.out.println();
		

		if (p1.compareTo(p2) < 0) {
			System.out.println("La persona p1 es menor que p2");
		} else if (p1.compareTo(p2) > 0) {
			System.out.println("La persona p1 es mayor que p2");
		} else {
			System.out.println("La persona p1 es igual a la persona p2");
		}

		if (p1.compareTo(p3) < 0) {
			System.out.println("La persona p1 es menor que p3");
		} else if (p1.compareTo(p3) > 0) {
			System.out.println("La persona p1 es mayor que p3");
		} else {
			System.out.println("La persona p1 es igual a la persona p3");
		}
		
		ListaOrdenada<Persona> lista = new ListaOrdenada<Persona>();
		lista.agregar(p1);
		lista.agregar(p2);
		lista.agregar(p3);
		lista.agregar(new Persona(99888777,"XXX"));
		System.out.println(lista);
		
		
		
	}

}
