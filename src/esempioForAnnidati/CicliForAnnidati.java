package esempioForAnnidati;

public class CicliForAnnidati {

	public static void main(String[] args) {
		//quesito: disegnare un rettangolo nella console
		int altezza = 4, larghezza = 10; //dimensioni del rettangolo
		
		//ciclo per disegnare le righe
		for(int contaRighe = 0; contaRighe < altezza;contaRighe++)
		{
			// ciclo per disegnare le "colonne" ( la larghezza di ogni riga)
			for(int contaColonne = 0; contaColonne<larghezza; contaColonne++)
			{
				System.out.print("@"); //print() per affiancare le @
				
			}
			System.out.println();
			
		}
		
		
		
		
	}

}