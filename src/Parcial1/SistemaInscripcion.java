package Parcial1;

import java.util.HashMap;



public class SistemaInscripcion {
	private HashMap<String, Alumno> alumnos;
	
	
	public SistemaInscripcion() {
		alumnos = new HashMap<String, Alumno>();
	}
	
	public boolean agregarAlumno(String libreta, String nombre, String apellido) {	
		if (alumnos.containsKey(libreta))
			return false;
		alumnos.put(libreta, new Alumno(libreta, nombre, apellido));
		return true;
	}
	
	public String obtenerComision(String materia, String libreta) {
		validarLibreta(libreta);
		return alumnos.get(libreta).comision(materia);
	}
	
	
	public void solicitarCambio(String libreta, String materia, String comision) {
		validarLibreta(libreta);
		if(alumnos.get(libreta).estaInscripto(materia))
			alumnos.get(libreta).inscribirse(materia, comision);
	}
	
	
	private void validarLibreta(String libreta) {
		if (!alumnos.containsKey(libreta))
			throw new RuntimeException("No existe un alumno con libreta "+libreta);	
	}
}
