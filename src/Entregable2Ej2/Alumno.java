package Entregable2Ej2;

import java.util.*;



public class Alumno {
	private double acumuladorNota;
	private int numLibreta;
	private String nombre;
	private String apellido;
	private HashMap<String, Double> materiasAprobadas;
	
	
	public Alumno(int num, String nombre, String apellido) {
		this.acumuladorNota=0;
		this.numLibreta= num;
		this.nombre= nombre;
		this.apellido= apellido;
		this.materiasAprobadas= new HashMap<String, Double>();
	}
	
	public void agregarMateria(String nombre, Double nota) {
		if(materiasAprobadas.get(nombre)==null && (nota>=4)) {
				materiasAprobadas.put(nombre,nota);
				acumuladorNota= acumuladorNota + nota;
		}
	}
	
	public int cantidadAprobadas() {
		return materiasAprobadas.size();
	}
	
	public int promedio() {
		double promedio=0;
		promedio = (acumuladorNota/cantidadAprobadas());
		return  (int)promedio;
	}
	
	public double getAcumuladorNota() {
		return acumuladorNota;
	}

	public void setAcumuladorNota(double acumuladorNota) {
		this.acumuladorNota = acumuladorNota;
	}

	public int getNumLibreta() {
		return numLibreta;
	}

	public void setNumLibreta(int numLibreta) {
		this.numLibreta = numLibreta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public HashMap<String, Double> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(HashMap<String, Double> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
}
