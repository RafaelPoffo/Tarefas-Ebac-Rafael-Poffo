package carros;
import java.util.ArrayList;
import java.util.List;

public class ListaCarros {
public static void main(String args[]) {
    List<Carro> ListaCarros = new ArrayList<>();
    ListaCarros.add(new Lada());
    ListaCarros.add(new Fusca());
    ListaCarros.add(new Brasilia());

    imprimirCarros(ListaCarros);
}
    public static void imprimirCarros(List<? extends Carro> lista) {
        for(Carro carro : lista) {
            System.out.println("O carro é do modelo: " + carro.getModelo());
        }
    }
}
