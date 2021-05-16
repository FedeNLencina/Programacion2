package HerenciaClase_04_05_21;

public class Vendedor extends Empleado {
	private float comision;
	private float ventas;
	
	public Vendedor(String nombre, int sueldo, float com) {
		super(nombre,sueldo);
		comision = com;
		ventas = 0;
	}

	public int sueldo(){
		return super.sueldo() + (int) (comision * ventas);
	}
	
	public void reiniciarVentas() {
		ventas = 0;
	}

	public void nuevaVenta(float vta) {
		ventas += vta;
	}
}
