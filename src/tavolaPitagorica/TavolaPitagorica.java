package tavolaPitagorica;

public class TavolaPitagorica {
    public static void main(String[] args) {
        
        // Ciclo per le righe
        for (int i = 1; i <= 10; i++) {
            // Ciclo per le colonne
            for (int j = 1; j <= 10; j++) {
                
                System.out.print((i * j) + "\t");
                
            }
            
            System.out.println();
        }
    }
}