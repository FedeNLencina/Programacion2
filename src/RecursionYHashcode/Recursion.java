package RecursionYHashcode;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacciRecur(48));
	}

	// Sucesión de Fibonacci:
	// 0  1  1  2  3  5  8  13  21  34  55  89
	static int fibonacciRecur(int n) {
		if (n <= 1)
			return n; // f0 = 0 y f1= 1
		else
			return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
	}
	
	public static int busquedaBin(int[] arr, int nro) {
		return -1;
	}
	

}
