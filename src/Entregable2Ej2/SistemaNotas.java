package Entregable2Ej2;

import java.util.HashMap;
import java.util.TreeSet;


public class SistemaNotas {
private HashMap<Integer,Alumno> alumnos;
	
	
	public SistemaNotas(){
		this.alumnos = new HashMap<Integer,Alumno>();
	}
	
	public void ingresarAlumno(Alumno ingresante) {
		if(alumnos.get(ingresante.getNumLibreta())==null)
			alumnos.put(ingresante.getNumLibreta(),ingresante);
	}
	
	public void asignarMasteriaAlumno(Integer libreta, String nombre, Double nota) {
		this.alumnos.get(libreta).agregarMateria(nombre, nota);
	}
	
	public int generarPormedio(Integer libreta) {
		return this.alumnos.get(libreta).promedio();
	}
	
	public int generarCantidadAprobadas (Integer libreta) {
		return this.alumnos.get(libreta).cantidadAprobadas();
	}
}
