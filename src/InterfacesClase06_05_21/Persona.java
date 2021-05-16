package InterfacesClase06_05_21;

// Al implementar la interface Comparable
// la clase esta obligada a implementar el metodo compareTo
public class Persona implements Comparable<Persona> {
	// IREP: true
	private int dni;
	private String nombre;

	public Persona(int doc, String nom) {
		dni = doc;
		nombre = nom;
	}

	public int getDNI() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return o.getDNI()-this.getDNI();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + "]";
	}

	
}
