package Entregable2ResolucionEnClase.Prog2_Entregables.src.tarea2;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;



public class SistemaNotasTest {
	
	private SistemaNotas sistemaNotas;
	
	@Before
	public void setUp() {
		sistemaNotas = new SistemaNotas();
		sistemaNotas.agregarAlumno("42861287/2016","Frodo", "Baggins");
	
		sistemaNotas.agregarNota("42861287/2016", "prog1", 5);
		sistemaNotas.agregarNota("42861287/2016", "prog2", 10);
		
	}
 

	
	@Test
	public void happyPathTest() {
		//Expected, Actual, Delta
		//Math.abs(Expected - Actual) <= Delta
		//Delta es la diferencia de redondeo, a partir de la cual considero que ambos valores son iguales
		
		
		assertEquals(Double.valueOf(7.5), sistemaNotas.obtenerPromedio("42861287/2016"), 0.1);
		assertEquals(Integer.valueOf(2), sistemaNotas.cantMateriasAprobadas("42861287/2016"));
	}
		
	@Test
	public void alumnoRepetidoTest() {		
		sistemaNotas.agregarAlumno("42861287/2016","Frodo", "Baggins");
		sistemaNotas.agregarNota("42861287/2016", "ip", 7);
		sistemaNotas.agregarNota("42861287/2016", "prog2", 9);
		
		assertEquals(Integer.valueOf(3), sistemaNotas.cantMateriasAprobadas("42861287/2016"));
		//Decisión de diseño: queda la ultima nota
		assertEquals(Double.valueOf(7),sistemaNotas.obtenerPromedio("42861287/2016"),0.1);
	}
	
	
	
}
