package RecursionYHashcode;

import java.util.ArrayList;
import java.util.HashSet;

public class PruebaEquals {

	public static void main(String[] args) {
		Punto p1 = new Punto(1, 2);
		Punto p2 = new Punto(1, 2);
		Punto q = new Punto(2, 3);

		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(q));

		
		HashSet<Punto> coll = new HashSet<Punto>();
		coll.add(p1);
		p1.setX(2);
		p1.setY(3);
		System.out.println(p1.equals(q));
		System.out.println(coll.contains(q));

		
//		System.out.println(p1.equals(p2));
//		Object p2a = p2;
//		System.out.println(p1.equals(p2a));

		
		Punto p = new Punto(1, 2);
		HashSet<Punto> col2 = new HashSet<Punto>();
		col2.add(p);
		System.out.println(col2.contains(p));
		p.setX(p.getX() + 1);
		System.out.println(col2.contains(p));

	}

}
