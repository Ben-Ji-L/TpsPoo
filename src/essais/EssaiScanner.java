package essais;

import java.util.Scanner;
import java.util.Date;

public class EssaiScanner {
	public static void main(String[] args) {
		Scanner scanPhrase = new Scanner(System.in);
		
		String ligne = scanPhrase.nextLine();
		
		System.out.println(ligne);
		
		Scanner scanLigne = new Scanner(ligne);
		
		while (scanLigne.hasNext()) {
			System.out.println(scanLigne.next());
		}
		scanLigne.close();
		
		String nb = scanPhrase.nextLine();
		
		Integer nombreInt = new Integer(nb);
		
		scanPhrase.close();
		
		Date now = new Date();
		
		System.out.println(now);
		
		Scanner scanDate = new Scanner(now.toString());
		
		String [] tabDate = new String [6];
		int i = 0;
		while(scanDate.hasNext()) {
			tabDate[i] = scanDate.next();
			i++;
		}
		
		for(String pouet: tabDate) {
			System.out.println(pouet);
		}
	}
}
