package Entregable2ResolucionEnClase.Prog2_Entregables.src.tarea2;

import java.util.HashMap;

/* IREP: las notas van del 4 al 10
 	_sumaNotas = la suma de las notas del diccionario _notas
 	notar que no es necesario decir que no hay materias duplicadas
 	dado que el resto del irep viene garantizado por el Map
 */

public class Alumno {
	
private String _libreta;
private String _nombre;
private String _apellido;

private HashMap<String, Integer> _notas;

private Integer _sumaNotas;  // para obtenerPromedio() en O(1)

	public Alumno(String libreta, String nombre, String apellido) {
		_notas = new HashMap<String, Integer>();
		_sumaNotas = 0;
		
		_libreta = libreta;
		_nombre = nombre;
		_apellido = apellido;
	}
	
	
	public void agrgarNota(String materia, Integer nota) {
		// el Map "redefine" normalmente, pero para actualizar _sumaNotas redefiniremos a mano
		
		if (nota<4 || nota>10)
			throw new RuntimeException("Nota invalida: debe estar entre 4 y 10");

//		if (_notas.containsKey(materia)) {
//			// quitamos la nota anterior	
//			Integer notaVieja = _notas.get(materia);
//			_notas.remove(materia);
//			// podria "ahorrarme" la variable, la dejamos x declaratividad.
//			_sumaNotas =_sumaNotas- notaVieja;
//		}

		Integer notaVieja = _notas.getOrDefault(materia,0);
		_notas.put(materia, nota);
		_sumaNotas =_sumaNotas + nota - notaVieja;
		
	}


	// tiene que ser O(1) x requerimiento tecnico
	public double obtenerPromedio() {
		// (double)_sumaNotas es para que "/" opere en double y no en integer
		// de lo contrario 15 / 2 = 7
		return (double)_sumaNotas / cantMateriasAprobadas();
	}


	public Integer cantMateriasAprobadas() {
		// TODO Auto-generated method stub
		return _notas.size();
	}

}
