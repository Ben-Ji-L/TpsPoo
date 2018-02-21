package util;

import java.util.ArrayList;

public class Agenda {

	private String nom;
	private ArrayList<Evenement> liste;

	public Agenda(String nom) {
		this.nom = nom;
		liste = new ArrayList<Evenement>();
	}

	public int indexOf(Evenement event) {
		return liste.indexOf(event);
	}

	public Evenement get(int index) {
		if (index <= liste.size())
			return liste.get(index);
		return null;
	}

	public void ajouter(Evenement event) {
		liste.add(event);
	}

	public String toString() {
		String str = this.nom + "\nqui contient :\n";

		for (int i = 0; i < liste.size(); i++) {
			str += " " + get(i) + "\n";
		}
		return str;
	}

	public boolean peutAccuellir(Evenement event) {
		for (Evenement aListe : liste) {
			if (aListe.chevauche(event)) {
				return false;
			}
		}
		return true;
	}
}
