package ModeloParcialEj1;

public  abstract class JugadoresDeEquipo extends Deportista{
		protected double sueldo;
		private String nombreEquipo;
		
		public JugadoresDeEquipo(String nombre,int peso, int altura, String equipo, double sueldo) {
			super (nombre,peso,altura);
			this.nombreEquipo= equipo;
			this.sueldo=sueldo;
		}
		
		@Override
		public double dineroGanado() {
			return this.sueldo;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(super.toString())
			  .append(" Equipo: ")
			  .append(nombreEquipo);
			
			return sb.toString();
			
		}
}
