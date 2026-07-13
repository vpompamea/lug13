package vacanze;

public class Vacanze {
    public int[] giorniVacanze;
    public int anniDiServizio;

    public void setVacanze() {
        giorniVacanze = new int[6];
      
        giorniVacanze[0] = 10; 
        giorniVacanze[1] = 15; 
        giorniVacanze[2] = 15;
        giorniVacanze[3] = 15;
        giorniVacanze[4] = 20; 
        giorniVacanze[5] = 20;
    }

    public void mostraGiorniVacanze() {
        int giorni;

        if (anniDiServizio > 5) {
            giorni = 25;
            
        } else {
            giorni = giorniVacanze[anniDiServizio];
        }

        System.out.println("Anni di servizio: " + anniDiServizio + " -> Giorni di vacanza spettanti: " + giorni);
    }
}