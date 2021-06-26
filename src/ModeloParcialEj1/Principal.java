package ModeloParcialEj1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Deportista> deportistas= new ArrayList<Deportista>();
		deportistas.add(new Boxeador ("Chino Maidana",85,170,5));
		deportistas.add(new Boxeador ("Mike Tayson",92,185,10));
		deportistas.add(new Tenista ("Djokovic",78,185,6));
		deportistas.add(new Futbolista("Lencina", 95, 187, "Fenix", 40000, 500));
		
		for (Deportista deportista: deportistas) {
			StringBuilder sb = new StringBuilder();
			sb.append(deportista.toString()).append(deportista.dineroGanado());
			System.out.println(sb);
		}
	}

}
