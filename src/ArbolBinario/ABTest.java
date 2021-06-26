package ArbolBinario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ABTest {
	AB<Integer> ab1, ab2;
	
	@Before
	public void setUp() throws Exception {
		ab1=new AB<Integer>();
		ab2=new AB<Integer>();
		
		ab2.agregar(25);
		ab2.agregar(42);
		ab2.agregar(80);
		ab2.agregar(96);
		ab2.agregar(44);
		ab2.agregar(84);
		ab2.agregar(50);
	}

	@Test
	public void testAlturaABvacio() {
		assertEquals(0, ab1.altura());
	}

	
	@Test
	public void testAlturaAB1nodo() {
		ab1.agregar(38);
		assertEquals(0, ab1.altura());
	}

	@Test
	public void testAlturaAB2nodo() {
		ab1.agregar(38);
		assertEquals(0, ab1.altura());
	}
}
