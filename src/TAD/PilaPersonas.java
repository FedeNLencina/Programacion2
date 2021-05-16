package TAD;

import java.util.LinkedList;

public class PilaPersonas {
	
	private LinkedList <Persona> personas;
	
	public PilaPersonas() {
		this.personas = new LinkedList <Persona>();
	}
	
	public void imprimirNombre() {
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}
	}
	
	public boolean personaEsAlta(Persona persona) {
		if (persona.getAltura()>1.80) {
			return true;
		}
		else
			return false;
	}
	
	public boolean esArgentino(Persona persona) {
		if (persona.getNacionalidad().equals("argentina")) {
			return true;
		}
		else {
			return false;
		}
	}
		

	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}
	
	public Persona ultimaPersona() {
		return personas.getLast();
	}
	
	public Persona eliminar() {
		return personas.removeLast();
	}
	
	public Persona tope() {
		return personas.getLast();	
	}
		
}
		


