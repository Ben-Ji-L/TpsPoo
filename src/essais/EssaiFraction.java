package essais;

import util.Fraction;

public class EssaiFraction {
	public static void main(String[] args) {
		Fraction f = new Fraction(4, 5);
		
		System.out.println(f);
		
		f.multiplier(new Fraction(1, 3));
		
		System.out.println(f);
		
		f.multiplierEntier(5);
		
		System.out.println(f);
		
		Fraction f2 = new Fraction(7, 3);
		f.addition(f2);
		System.out.println(f);
		
		System.out.println(f.getDecimale());
		
		Fraction f3 = f.produit(f2);
		
		System.out.println(f3);
		
	}
}
