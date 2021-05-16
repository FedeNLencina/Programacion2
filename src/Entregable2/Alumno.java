package Entregable2;
import java.util.*;


public class Alumno {
	
	private int numLibreta;
	private String nombre;
	private String apellido;
	private TreeSet<Materia> materiasAprobadas;
	
	
	public Alumno(int num, String nombre, String apellido) {
		this.numLibreta= num;
		this.nombre= nombre;
		this.apellido= apellido;
		this.materiasAprobadas= new TreeSet<Materia>();
	}
	
	public void agregarMateria(Materia nueva) {
		if(!materiasAprobadas.contains(nueva) && (nueva.getNota()>=4)) {
				materiasAprobadas.add(nueva);
		}
	}
	
	public int cantidadAprobadas() {
		return materiasAprobadas.size();
	}
	
	public int promedio() {
		double promedio=0;
		for (Materia materia : materiasAprobadas) {
			promedio= promedio + materia.getNota();
		}
		promedio = (promedio/cantidadAprobadas());
		return (int)promedio;
	}
	
	//IREP
	//0<=this.numLibreta
	//0<this.nombre.length>=3
	//0<this.apellido.length>=3
	//Como usamos un TreeSet, ya no hace falta indicar que un alumno no se repita dentro del conjunto. El IREP es siempre verdadero, ya que la estructura TreeSet garantiza que no haya materias duplicadas.
	//
	//
	//
	//
	
}
