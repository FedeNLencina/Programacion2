package ModeloParcialEj1;

import java.util.ArrayList;

public class Boxeador extends Deportista {
	private ArrayList<Evento> eventos;
	private int categoria;
	
	public Boxeador(String nombre, int peso, int altura, int categoria) {
		super(nombre,peso,altura);
		this.deporte="Boxeo";
		this.categoria = categoria;
		this.eventos= new ArrayList<Evento>();
		
	}
	
	@Override
	public double dineroGanado() {
		double ganancia= 0;
		for( Evento evento : eventos) {
			ganancia = ganancia + (evento.getRecaudacion()*0.70);
		}
		return ganancia;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString())
		  .append(" Categoria: ")
		  .append(categoria);
		
		return sb.toString();
		
	}
	
}
