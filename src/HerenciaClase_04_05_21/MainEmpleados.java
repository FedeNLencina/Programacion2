package HerenciaClase_04_05_21;

import java.util.ArrayList;

public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Empleado e = new Empleado("Esteban",100);
		// Esto no compila
		// e.asignarPresupuesto(500);
		
//		Ejecutivo jefe = new Ejecutivo( "Armando Mucho", 1000); 
//		jefe.asignarPresupuesto(1500); 
//		jefe.aumentarSueldo(5); 
//		System.out.println(jefe.toString());

		Empleado e = new Ejecutivo("Esteban Quito",2000);
		e.aumentarSueldo(10);
		if (e instanceof Ejecutivo) {
			((Ejecutivo) e).asignarPresupuesto(15000);
		}
//		System.out.println(e);
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(e);
		empleados.add(new Vendedor("Juan",1000,0.1f));
		empleados.add(new Empleado("Jose",500));
		
		for (Empleado emp: empleados) {
			if (emp instanceof Vendedor)
				((Vendedor)emp).nuevaVenta(5000);
		}

		for (Empleado emp: empleados) {
			System.out.println(emp.toString() + ": " + emp.sueldo());
		}

	}

}
