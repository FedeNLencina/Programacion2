package Parcial1;

import java.util.HashMap;

public class Alumno {
	
	private String libreta;
	private String nombre;
	private String apellido;

	private HashMap<String, String> materias;
	
	
	public Alumno(String libreta, String nombre, String apellido) {
		materias = new HashMap<String, String>();
	
		libreta = libreta;
		nombre = nombre;
		apellido = apellido;
	}
	
	public void inscribirse(String materia, String codigo) {
		if(!materias.containsKey(materia)) {
			materias.put(materia, codigo);
		}
	}
	
	public String comision(String materia) {
		return materias.get(materia);
	}
	
	public boolean estaInscripto(String materia) {
		if(materias.containsKey(materia))
			return true;
		return false;
	}
	public int cantidadAnotadas() {
		return materias.size();
	}
}
