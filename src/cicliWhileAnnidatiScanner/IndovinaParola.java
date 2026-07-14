package cicliWhileAnnidatiScanner;

import java.util.Scanner; // Scanner non si trova in java.lang

public class IndovinaParola {
	public static void main(String[] args) {
		// programma che indovina una parola immessa dall'utente!
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola = input.nextLine(); // nextLine() acquisisce e salva String
		String indovina = ""; // qui verranno salvate le parole tentate
		long numeroTentativi = 0;
		
		//ciclo di controllo se la parola è stata indovinata
		
		while(!indovina.equals(parola.toLowerCase())) { //parola trasformata in minuscolo per ridurre il numero di tentativi
			// se indovina non è parola
			indovina = ""; // resetto indovina
			
			// ciclo di creazione di indovina da confrontare 
			while(indovina.length()  < parola.length()) {
				//java deve scegliere una lettera a caso avente codice ASCII compreso tra 97 e 122; abbiamo a disposizione il metodo random() che sorteggia un numero decimale tra 0 incluso e 1 escluso(da 0 a 0.9 periodico)
				char carattere = (char)(Math.random() * 26 + 97);
				// Math.random() sorteggia un numero tra 0 e 0.9 periodico
				// Math.random()*26: un numero tra 0 e 25,9 periodico 
				// Math.random()*26+97 : sposta il numero sui codici ASCII dalla 'a' alla 'z'
				//(char) tronca la parte decimale e salva nella variabile il carattere sorteggiato
				indovina = indovina + carattere; // si aggiunge il carattere sorteggiato alla String da confrontare 
				
				
			} // arrivo qui se indovina ha length() uguale a parola, quindi posso confrontare le due String
			
			
			numeroTentativi++;
		} // arrivo qui se indovina coincide con parola		
		System.out.println(indovina);
		System.out.println(parola + " trovata dopo " + numeroTentativi + " tentativi"); 
		input.close();
	}

}