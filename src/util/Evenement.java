package util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Evenement {
	
	private String intitule;
	private String lieu;
	private GregorianCalendar dateDebut;
	private GregorianCalendar dateFin;
	
	public Evenement(String intitule, String lieu, GregorianCalendar datDebut, GregorianCalendar dateFin) {
		this.intitule = intitule;
		this.lieu = lieu;
		this.dateDebut = datDebut;
		this.dateFin = dateFin;
		
		if(!dateDebut.before(dateFin))
			this.dateDebut = this.dateFin;
	}
	
	public String toString( ) {
		return intitule + " à " + lieu + " commence le: " + dateFormatee(dateDebut) + " et se termine le: " + dateFormatee(dateFin);
	}
	
	public boolean equals(Object objet) {
		if(objet == null || !(objet instanceof Evenement)) 
			return false;
		return this.equals((Evenement) objet);
	}
	
	public static String dateFormatee(GregorianCalendar date) {
		return date.get(Calendar.DAY_OF_MONTH) + "/" +
				(date.get(Calendar.MONTH) + 1) + "/" +
				date.get(Calendar.YEAR);
	}
	
	public boolean chevauche(Evenement autre) {
		if(this.dateFin.before(autre.dateDebut) || autre.dateFin.before(this.dateDebut)) {
			return false;
		}
		return true;
	}
}
