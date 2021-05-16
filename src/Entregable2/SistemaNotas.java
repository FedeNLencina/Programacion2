package Entregable2;

import java.util.*;

public class SistemaNotas {
	private TreeSet<Alumno> alumnos;
	
	
	public SistemaNotas(){
		this.alumnos = new TreeSet<Alumno>();
	}
	
	public void ingresarAlumno(Alumno ingresante) {
		if(!alumnos.contains(ingresante))
			this.alumnos.add(ingresante);
	}
	
	public void asignarMasteriaAlumno(Alumno estudiante, Materia materia) {
		estudiante.agregarMateria(materia);
	}
	
	public int generarPormedio(Alumno estudiante) {
		return estudiante.promedio();
	}
	
	public int genearCantidadAprobadas (Alumno estudiante) {
		return estudiante.cantidadAprobadas();
	}
	
	
	//IREP
	//Como usamos un TreeSet, ya no hace falta indicar que un alumno no se repita dentro del conjunto.
	//
	//
	//
	//
	//
	//
	//
	
}
