package essais;

import java.util.GregorianCalendar;

import util.Agenda;
import util.Evenement;

public class EssaiAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda("agenda");
		
		Evenement event = new Evenement("mariage", "Inde", new GregorianCalendar(2018, 01, 05), new GregorianCalendar(2018, 02, 01));
		Evenement event2 = new Evenement("weekend", "lille", new GregorianCalendar(2018, 02, 23), new GregorianCalendar(2018, 02, 25));

		agenda.ajouter(event);
		agenda.ajouter(event2);
		
		System.out.println(agenda.indexOf(event));
		System.out.println(agenda.indexOf(event2));
		System.out.println(agenda.get(0));
		
		System.out.println(agenda);
		
		System.out.println(agenda.peutAccuellir(event));
	}
}
