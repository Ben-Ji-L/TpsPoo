package util;

public class Fraction {

	private int num;
	private int deno;
	
	public Fraction(int numerateur, int denominateur) {
		this.num = numerateur;
		this.deno = denominateur;
	}
	
	public Fraction(int numerateur) {
		this.num = numerateur;
		this.deno = 1;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDeno() {
		return deno;
	}
	
	public String toString() {
		return num + "/" + deno;
	}
	
	public void multiplier(Fraction autreFraction) {
		this.num += autreFraction.num;
		this.deno += autreFraction.deno;
	}
	
	public void multiplierEntier(int entier) {
		this.num = this.num * entier;
	}
	
	public void addition(Fraction autreFraction) {
		if (this.deno == autreFraction.deno) {
			this.num += autreFraction.num;
		}
		this.num = this.num * autreFraction.deno + this.deno * autreFraction.num;
		this.deno = this.deno * autreFraction.deno;
	}
	
	public double getDecimale() {
		return (double) this.num / this.deno;
	}
	
	public Fraction somme(Fraction autreFraction) {
		this.addition(autreFraction);
		Fraction resultat = new Fraction(this.num, this.deno);
		return resultat;
		
	}
	
	public Fraction produit(Fraction autreFraction) {
		this.multiplier(autreFraction);
		Fraction resultat = new Fraction(this.num, this.deno);
		return resultat;
	}
}