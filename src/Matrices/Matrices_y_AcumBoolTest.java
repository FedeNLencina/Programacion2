package Matrices;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Matrices_y_AcumBoolTest {

	int[][] mat1 = { {2,3,5}, {-2,-3,5}, {-1,-8,-10}, {1,-1,0} };
	int[][] mat2 = new int[4][3];
	Object o;
	
	@Before
	public void setUp() throws Exception {
		for (int fil=0; fil<mat2.length; fil++)
			for (int col=0; col<mat2[fil].length; col++)
				mat2[fil][col] = fil-col;
	}

	@Test
	public void testAlgunaFilaTodosNeg1() {
		mat2[0][0]=-2;
		assertTrue(Matrices_y_AcumBool.algunaFilaTodosNeg(mat2));
	}

	@Test
	public void testAlgunaFilaTodosNeg2() {
		assertFalse(Matrices_y_AcumBool.algunaFilaTodosNeg(mat2));
	}

	@Test
	public void testAlgunaFilaTodosNeg3() {
		assertTrue( Matrices_y_AcumBool.algunaFilaTodosNeg(mat1) );
	}

}
