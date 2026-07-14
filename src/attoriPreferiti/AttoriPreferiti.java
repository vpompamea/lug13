package attoriPreferiti;

import java.util.ArrayList;

public class AttoriPreferiti {
    public ArrayList<String> lista = new ArrayList<>();

    public void stampaLista() {
        for (String attore : lista) {
            System.out.println("- " + attore);
        }
        System.out.println();
    }
}