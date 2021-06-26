package ArbolBinarioClase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ABTest {
	AB<Integer> ab1, ab2;
	
	@Before
	public void setUp() throws Exception {
		ab1 = new AB<Integer>();
		
		ab2 = new AB<Integer>();
		ab2.agregar(25);
		ab2.agregar(42);
	}

	// Tests para el método altura()
	// -----------------------------
	@Test
	public void testAlturaABvacio() {
		assertEquals(0,ab1.altura());
	}

	@Test
	public void testAlturaAB1nodo() {
		ab1.agregar(38);
		assertEquals(1,ab1.altura());
	}

	@Test
	public void testAlturaAB2nodos() {
		assertEquals(2,ab2.altura());
	}

	@Test
	public void testAlturaAB3nodos() {
		ab2.agregar(38);
		assertEquals(2,ab2.altura());
	}

	@Test
	public void testAlturaAB6nodos() {
		for (int i=0; i<4; i++)
			ab2.agregar(45+i);
		assertEquals(4,ab2.altura());
	}
	
	// Tests para el método cantNodos()
	// --------------------------------
	@Test
	public void testCantNodosABvacio() {
		assertEquals(0,ab1.cantNodos());
	}

	@Test
	public void testCantNodosAB1nodo() {
		ab1.agregar(38);
		assertEquals(1,ab1.cantNodos());
	}

	@Test
	public void testCantNodosAB2nodos() {
		assertEquals(2,ab2.cantNodos());
	}

	@Test
	public void testCantNodosAB6nodos() {
		for (int i=0; i<4; i++)
			ab2.agregar(45+i);
		assertEquals(6,ab2.cantNodos());
	}

	// Tests para el método estaBalanceado()
	// -------------------------------------
	@Test
	public void testBalanceadoABvacio() {
		assertFalse(ab1.estaBalanceado());
	}
	
	
	@Test
	public void testCantHojasABvacio() {
		assertEquals(0,ab1.cantHojas());
	}

	
	@Test
    public void testIesimo() {
        assertEquals((Integer)2,  ab1.iesimo(0));
        assertEquals((Integer)4,  ab1.iesimo(1));
        assertEquals((Integer)5,  ab1.iesimo(2));
        assertEquals((Integer)8,  ab1.iesimo(3));
        assertEquals((Integer)10, ab1.iesimo(4));
        assertEquals((Integer)12, ab1.iesimo(5));
        assertEquals((Integer)15, ab1.iesimo(6));
        assertEquals((Integer)25, ab1.iesimo(7));
        assertEquals((Integer)35, ab1.iesimo(8));
        assertEquals((Integer)43, ab1.iesimo(9));
    }

}
