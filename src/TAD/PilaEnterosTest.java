package TAD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaEnterosTest {
	
	private PilaEnteros pila;
	
	@Before
	public void setUp() throws Exception {
		pila = new PilaEnteros();
		pila.apilar(2);
		
	}

	@Test
	public void testApilar() {
		pila.apilar(1);
		
	}

	@Test
	public void testDesapilar() {
		pila.desapilar();
	}

	@Test
	public void testTope() {
		pila.desapilar();
		assertEquals(1, pila.getTamaño());
	}

	@Test
	public void testEsVacia() {
		assertFalse(pila.esVacia());
	}

}
