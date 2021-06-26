package ModeloParcialEj1;

public abstract class Deportista {
		protected String nombre;
		protected int peso;
		protected int altura;
		protected String deporte;
	
		
		public Deportista(String nombre, int peso, int altura) {
			this.nombre=nombre;
			this.peso=peso;
			this.altura=altura;
		}
		
		public abstract double dineroGanado();
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(getClass().getSimpleName())
			  .append(" Nombre: ")
			  .append(nombre)
			  .append(" Peso: ")
			  .append(peso)
			  .append(" Altura: ")
			  .append(altura)
			  .append(" Deporte: ")
			  .append(deporte);
			  
			return sb.toString();
			  
		}
		
}
