package ModeloParcialEj1;

import java.util.ArrayList;

public class Futbolista extends JugadoresDeEquipo{
	private ArrayList<Integer> partidosGanados;
	private double premio;
	
	public Futbolista(String nombre,int peso, int altura, String equipo, double sueldo, double premio) {
		super(nombre,peso, altura, equipo,sueldo);
		this.deporte="Futbol";
		this.premio=premio;
		this.partidosGanados= new ArrayList<Integer>();
		
	}
	

	@Override
	public double dineroGanado() {
		double ganancia = 0;
		for (Integer partido : partidosGanados) {
			ganancia = sueldo + premio;
		}
		return ganancia;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		
		return sb.toString();
		
	}

}
