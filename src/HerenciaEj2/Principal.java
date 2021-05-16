package HerenciaEj2;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
	      StringBuilder sb;
	      ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	      vehiculos.add(new Jetsky("Goma"));
	      vehiculos.add(new Triciclo("Jay"));
	      vehiculos.add(new Automovil("Ford"));
	      vehiculos.add(new Barco("Sydney"));
	      vehiculos.add(new Automovil("Toyota"));
	      vehiculos.add(new Jetsky("Yahama"));

	      for (Vehiculo v: vehiculos) {
	         sb = new StringBuilder(v.toString());
	         sb.append(" Marca: ").append(v.nombre());
	         sb.append(" y tiene: ").append(v.cantidadRuedas()).append(" ruedas");
	         System.out.println(sb);
	      }
	   }
}
