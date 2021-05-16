package TAD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaPersonasTest {

	PilaPersonas lista;
	Persona segunda = new Persona("Nicolas", "Rimmele", 25, 1.88, "aleman");
	@Before
	public void setUp() throws Exception {
		lista= new PilaPersonas();
		Persona primera = new Persona("Federico", "Lencina", 25, 1.88, "argentina");
		lista.agregarPersona(primera);
	}

	@Test
	public void testImprimirNombre() {
		lista.imprimirNombre();
	}

	@Test
	public void testPersonaEsAlta() {
		assertTrue(lista.personaEsAlta(lista.ultimaPersona()));
	}

	@Test
	public void testEsArgentino() {
		assertTrue(lista.esArgentino(lista.ultimaPersona()));
	}
	@Test
	public void testAgregarPersona() {
		lista.agregarPersona(segunda);
	}

	@Test
	public void testUltimaPersona() {
		lista.ultimaPersona();
	}

	@Test
	public void testEliminar() {
		lista.eliminar();
	}

	@Test
	public void testTope() {
		lista.tope();
	}
}
