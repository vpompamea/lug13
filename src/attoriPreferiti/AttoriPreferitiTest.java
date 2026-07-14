package attoriPreferiti;

public class AttoriPreferitiTest {
    public static void main(String[] args) {
        AttoriPreferiti mieiAttori = new AttoriPreferiti();

        mieiAttori.lista.add("Sandra Bullock");
        mieiAttori.lista.add("Johnny Depp");
        mieiAttori.lista.add("Drew Barrymore");

        System.out.println("Lista iniziale:");
        mieiAttori.stampaLista();

        mieiAttori.lista.remove(1);
        mieiAttori.lista.add(2, "Johnny Depp");

        System.out.println("Lista dopo lo spostamento:");
        mieiAttori.stampaLista();
    }
}