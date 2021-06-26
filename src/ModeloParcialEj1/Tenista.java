package ModeloParcialEj1;

import java.util.ArrayList;

public class Tenista extends Deportista {
	private int ranking;
	private ArrayList<Torneo> torneosGanados;
	
	public Tenista(String nombre, int peso, int altura,int ranking) {
		super(nombre,peso,altura);
		this.deporte="Tenis";
		this.ranking= ranking;
		this.torneosGanados= new ArrayList<Torneo>();
		
	}
	
	@Override
	public double dineroGanado() {
		double ganancia=0;
		for( Torneo torneo : torneosGanados)
			ganancia= ganancia + torneo.getPremio();
		return ganancia;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString())
		  .append(" Ranking: ")
		  .append(ranking)
		  .append(" Torneos ganados :")
		  .append(torneosGanados.size());
		
		return sb.toString();
		
	}

}
