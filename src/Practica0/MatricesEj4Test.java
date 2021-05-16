package Practica0;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatricesEj4Test {
	
	int [] listaA = {11,20,30,10};
	int [] listaB = {11,20,30,12};
	
	@Before
	public void setUp() throws Exception {
		this.listaA= new int [] {11,20,30,10};
	}

	@Test
	public void testMayorDiversidad() {
		this.listaA= new int [] {20,30,10};
		int largo= this.listaA.length;
	}
	
	@Test
	public void testMayor() {
		int largo= this.listaA.length;
	}

}
