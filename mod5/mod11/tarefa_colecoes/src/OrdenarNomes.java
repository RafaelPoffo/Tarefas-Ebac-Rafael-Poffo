import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarNomes {
    public static void main(String args[]) {
        String nomesLista = "Rafael,Júlia,Carlos,Antonia";
        String[] nomesArray = nomesLista.split(",");
        List<String> nomes = new ArrayList<>(Arrays.asList(nomesArray));
        Collections.sort(nomes);

        System.out.println("--Lista de nomes em ordem alfabética--");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}