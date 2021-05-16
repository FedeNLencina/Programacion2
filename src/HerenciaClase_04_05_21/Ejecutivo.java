package HerenciaClase_04_05_21;

public class Ejecutivo extends Empleado {
	int presupuesto;
	
	public Ejecutivo(String nombre, int sueldo) {
		super(nombre,sueldo);
	}

	public Ejecutivo(String nombre, int sueldo, int p) {
		super(nombre,sueldo);
		presupuesto = p;
	}

	void asignarPresupuesto(int p) {
		presupuesto = p;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		return sb.append(" Presupuesto: ")
				.append(presupuesto).toString();
	}

}
