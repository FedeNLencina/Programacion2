package Practica0;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Practica0Test {

	int [] listaA = {11,20,30,10};
	int [] listaB = {11,20,30,12};
	int [] listaC = {16,17,40,25};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEsMayor10() {
		
	}

	@Test
	public void testMayor10() {
		assertFalse(Practica0.mayor10(listaA)); //el assert significa "afirmo", es una funcion del jUnit y esta ya viene importada cuando creamos la clase de tests.
		assertTrue(Practica0.mayor10(listaB));
	}

}
