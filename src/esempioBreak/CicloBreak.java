package esempioBreak;

public class CicloBreak {

	public static void main(String[] args) {
		
		int punteggioMin = 12;
		boolean superato = false;
		int[] punteggi = {4, 6, 2, 18, 12, 34, 9};
		
		//voglio sapere se uno dei punteggi dell'array supera punteggioMin
		for(int punteggioSingolo : punteggi)
		{
			//punteggioSingolo assume ciascuno dei valori dell'array punteggi(4, poi 6, poi 2, poi 8, ecc..., non è l'indice
			
			if(punteggioSingolo > punteggioMin) {
				superato = true;
				System.out.println(punteggioSingolo);
				break; //esce dal ciclo perchè la condizione è soddisfatta
			}
			
			
			
		}
		System.out.println("Il valore è stato superato almeno una volta? " + superato);
		
		
		
		
		
	}

}