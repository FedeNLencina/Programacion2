package TecJava.Prog2_Meet_com1.src.c_20210422_TecJava;

public class Prueba_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Comparacion de tiempos entre
		// concatenacion de String y append de StringBuilder
		int concat = 200000;

		String s = new String();
		long inicio = System.currentTimeMillis();
		for (int i=1;i<=concat;i++) {
			s = s + "x";
		}
		long total = System.currentTimeMillis() - inicio;
		System.out.println("Miliseg. String: "+total);
		System.out.println("Longitud String: "+s.length());

		
		StringBuilder sb = new StringBuilder();
		long inicio2 = System.currentTimeMillis();
		for (int i=1;i<=concat;i++) {
			sb.append("x");
		}
		String s2 = sb.toString();
		long total2 = System.currentTimeMillis() - inicio2;
		System.out.println("Miliseg. StringBuilder: "+total2);
		System.out.println("Longitud StringBuilder: "+s2.length());


	}

}
