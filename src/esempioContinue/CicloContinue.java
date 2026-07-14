package esempioContinue;

public class CicloContinue {

	public static void main(String[] args) {
		
		int punteggioMin = 18;
		int superamentiRichiesti = 3;
		int[] punteggi = {4,6,2,18,12,34,9};
		
		for(int punteggioSingolo : punteggi)
		{
			if(punteggioSingolo <= punteggioMin) //se la condizione non è soddisfatta ...
			{
				continue; // torna all'inizio del ciclo ignorando quanto segue
			}
			
			superamentiRichiesti--; // se arrivo qui l'if era falso, la condizione era soddisfatta
			
			
		}
		
		System.out.println("Superamenti mancanti: " + Math.max(0, superamentiRichiesti)); // max() evita di visualizzare valori negativi se punteggioMin è superato più di 3 volte
		
		
			
		
		
		
	}

}