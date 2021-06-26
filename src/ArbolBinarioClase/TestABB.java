package ArbolBinarioClase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestABB {

	ABB<Integer> abbint, abbint2;

	@Before
	public void setUp() throws Exception {
		abbint = new ABB<Integer>();

		abbint2 = new ABB<Integer>();
		abbint2.agregar(4);
		abbint2.agregar(2);
		abbint2.agregar(8);
		abbint2.agregar(1);
		abbint2.agregar(3);
		abbint2.agregar(7);
		abbint2.agregar(9);
		abbint2.agregar(6);
		abbint2.agregar(5);
/*

abbint2 = 

        4
      /   \
     2     8
    / \   / \
   1   3 7   9
        /
       6
      /
     5

*/
	}

	
	@Test
	public void testAlturaABvacio() {
		assertEquals(0,abbint.altura());
	}

	@Test
	public void testAlturaABBunNodo() {
		abbint.agregar(20);
		assertEquals(1,abbint.altura());
	}

	@Test
	public void testAlturaABBdosNodos() {
		abbint.agregar(20);
		abbint.agregar(10);
		assertEquals(2,abbint.altura());
	}

	@Test
	public void testAlturaABBtresNodos1() {
		abbint.agregar(20);
		abbint.agregar(10);
		abbint.agregar(44);
		assertEquals(2,abbint.altura());
	}

	@Test
	public void testAlturaABBtresNodos2() {
		abbint.agregar(20);
		abbint.agregar(10);
		abbint.agregar(5);
		assertEquals(3,abbint.altura());
	}

	@Test
	public void testAlturaABBcuatroNodos() {
		abbint.agregar(44);
		abbint.agregar(20);
		abbint.agregar(10);
		abbint.agregar(2);
		assertEquals(4,abbint.altura());
	}

	@Test
	public void testAlturaABBsieteNodos() {
		abbint.agregar(11);
		abbint.agregar(8);
		abbint.agregar(44);
		abbint.agregar(20);
		abbint.agregar(10);
		abbint.agregar(52);
		abbint.agregar(2);
		assertEquals(3,abbint.altura());
	}

	@Test
	public void testBalanceado() {
		abbint.agregar(11);
		assertTrue(abbint.estaBalanceado());
		abbint.agregar(8);
		assertTrue(abbint.estaBalanceado());
		abbint.agregar(44);
		assertTrue(abbint.estaBalanceado());
		abbint.agregar(20);
		assertTrue(abbint.estaBalanceado());
		abbint.agregar(10);
		assertTrue(abbint.estaBalanceado());
		abbint.agregar(22);
		assertFalse(abbint.estaBalanceado());
		abbint.agregar(52);
		assertTrue(abbint.estaBalanceado());
	}

	@Test
	public void testMinimo() {
		abbint.agregar(11);
		abbint.agregar(8);
		abbint.agregar(44);
		abbint.agregar(20);
		abbint.agregar(10);
		assertEquals((Integer)8, abbint.minimo());
	}

	@Test
	public void testPertenece() {
		abbint.agregar(11);
		abbint.agregar(8);
		abbint.agregar(44);
		abbint.agregar(20);
		abbint.agregar(10);
		abbint.agregar(22);
		assertTrue(abbint.pertenece(11));
		assertTrue(abbint.pertenece(44));
		assertFalse(abbint.pertenece(40));
	}

	@Test
	public void testCantNodos() {
		assertEquals(0,abbint.cantNodos());
		abbint.agregar(11);
		assertEquals(1,abbint.cantNodos());
		abbint.agregar(8);
		assertEquals(2,abbint.cantNodos());
		abbint.agregar(44);
		abbint.agregar(20);
		abbint.agregar(10);
		abbint.agregar(22);
		assertEquals(6,abbint.cantNodos());
	}

	@Test
	public void testCantHojas() {
		assertEquals(0,abbint.cantHojas());
		abbint.agregar(11);
		assertEquals(1,abbint.cantHojas());
		abbint.agregar(8);
		assertEquals(1,abbint.cantHojas());
		abbint.agregar(44);
		assertEquals(2,abbint.cantHojas());
		abbint.agregar(20);
		assertEquals(2,abbint.cantHojas());
		abbint.agregar(10);
		assertEquals(2,abbint.cantHojas());
		abbint.agregar(22);
		assertEquals(2,abbint.cantHojas());
		abbint.agregar(52);
		assertEquals(3,abbint.cantHojas());
	}
	
	@Test
	public void testNivel() {
		assertEquals(abbint2.nivel(33), -1);
		assertEquals(abbint2.nivel(6), 4);
		assertEquals(abbint2.nivel(5), 5);		
		assertEquals(abbint2.nivel(1), 3);
		assertEquals(abbint2.nivel(4), 1);
	}

	@Test
	public void testMaximaHoja() {
		assertEquals((Integer)9,abbint2.maximaHoja());
	}

}
