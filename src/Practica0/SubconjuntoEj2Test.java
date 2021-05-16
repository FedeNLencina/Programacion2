package Practica0;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubconjuntoEj2Test {
	int [] listaA = {10,20};
	int [] listaB = {11,30,20,12};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPertenecenTodos() {
		assertFalse(SubconjuntoEj2.pertenecenTodos(listaA, listaB));
	}

}
