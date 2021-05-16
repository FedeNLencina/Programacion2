package Entregable2ResolucionEnClase.Prog2_Entregables.src.tarea2;

import java.util.HashMap;

/* IREP: para toda clave c: c == alumno.libreta
 * 
 */
public class SistemaNotas {
	// 1er enfoque: abstraccion ok, se complica el obtener con libreta (es O(n)), 
	//              implementar equals y hashcode
	// HashSet<Alumno> alumnos;
	// 2do enfoque: abstraccion repite libreta, pero facilita lo demas
	private HashMap<String, Alumno> alumnos;
	

	public SistemaNotas() {
		alumnos = new HashMap<String, Alumno>();
	}

	public boolean agregarAlumno(String libreta, String nombre, String apellido) {	
		// por la semantica del enunciado debemos evitar "redefinir" el alumno
		
		if (alumnos.containsKey(libreta))
			return false;
		alumnos.put(libreta, new Alumno(libreta, nombre, apellido));
		return true;
	}

	public void agregarNota(String libreta, String materia, int nota) {
		validarLibreta(libreta);
		alumnos.get(libreta).agrgarNota(materia, nota);		
	}

	public double obtenerPromedio(String libreta) {
		// TODO Auto-generated method stub
		validarLibreta(libreta);
		return alumnos.get(libreta).obtenerPromedio();
	}

	public Integer cantMateriasAprobadas(String libreta) {
		// TODO Auto-generated method stub
		validarLibreta(libreta);
		return alumnos.get(libreta).cantMateriasAprobadas();
	}

	private void validarLibreta(String libreta) {
		if (!alumnos.containsKey(libreta))
			throw new RuntimeException("No existe un alumno con libreta "+libreta);	
	}
}
