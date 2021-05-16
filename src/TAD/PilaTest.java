package TAD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaTest {

	/*Pila <T> p1, p2; //asi da error porque java no reconoce el toipo T, a diferencia de la clase en este caso hay que declarar el tipo dentro de los <> ya que es generico entonces puedo reemplazarlo
	*/
	
	Pila <Integer> p1, p2;
	Pila <String>  p1s, p2s;  //esto esta bien ya que al ser generico dentro de las llaves puedo poner el tipo que quiera
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testApilar() {
		fail("Not yet implemented");
	}

	@Test
	public void testDesapilar() {
		fail("Not yet implemented");
	}

	@Test
	public void testTope() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsVacia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTamaño() {
		fail("Not yet implemented");
	}

}
