package essais;

import java.util.GregorianCalendar;

import util.Evenement;

public class EssaiEvenement {

	public static void main(String[] args) {
		
		GregorianCalendar debut = new GregorianCalendar(2018, 01, 17);
		GregorianCalendar fin = new GregorianCalendar(2018, 01, 19);
		Evenement event = new Evenement("Week end", "maison", debut, fin);
		
		Evenement event2 = new Evenement("ikfhd", "ejslj", new GregorianCalendar(2018, 01, 17), new GregorianCalendar(2019, 01, 04));
		
		System.out.println(event);
		
		System.out.println(event.chevauche(event2));
	}

}
