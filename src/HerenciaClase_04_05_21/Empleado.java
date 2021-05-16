package HerenciaClase_04_05_21;

public class Empleado {

	private String nombre;
	private int numEmpleado, sueldo;
	static private int contador = 0;

	Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numEmpleado = ++contador;
	}

//	Empleado() {
//		this.numEmpleado = ++contador;
//	}

	public void aumentarSueldo(int porcentaje) {
		sueldo += (int) (sueldo * porcentaje / 100);
	}
	
	public int sueldo(){
		return sueldo;
	}
	
	public String toString() {
		return "Num. empleado " + numEmpleado + " Nombre: " + nombre +
				" Sueldo: " + sueldo;
		}


}
