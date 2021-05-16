package TecJava.Prog2_Meet_com1.src.c_20210422_TecJava;


public class TecJava {
	
	public static String separarMiles(String numero) {
		int ultimaPosicion = numero.length()-1;
		String s= "";
		int cont=0;
		
		for(int i=ultimaPosicion; i>= 0;i--) {
			if (cont==3) {
				s= numero.charAt(i) + "." + s;
				cont=1;
			}
			else {
					s= numero.charAt(i) + s;
					System.out.println(cont);
					cont= cont + 1;
					System.out.println(cont);
			}
			
		}
		return s;
	}

	public static String separarMiles2(String numero) {
		StringBuilder s= new StringBuilder();
		int ultimaPosicion = numero.length()-1;
		int cont=0;
		
		for(int i=ultimaPosicion; i>=0; i--) {
			if (cont==3) {
				s.append('.');
				s.append(numero.charAt(i));
				cont=1;
			}
			else {
				s.append(numero.charAt(i));
				System.out.println(cont);
				cont= cont + 1;
				System.out.println(cont);
		}
		}
		s.reverse();
		String nuevo=s.toString();
		return nuevo;
	}
	
	public static void main (String[]args) {
		String numero ="6512345678";
		String nuevo = separarMiles2(numero);
		
		System.out.println(nuevo);
		System.out.println(numero);
	}
}
