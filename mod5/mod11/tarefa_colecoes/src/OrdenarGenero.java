import java.util.ArrayList;
import java.util.List;

class Pessoa {
    String nome;
    String genero;

    public Pessoa (String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
}

public class OrdenarGenero{
    public static void main (String args[]){
        List<Pessoa> lista = new ArrayList<>();

        Pessoa a = new Pessoa("Rafael", "masculino");
        Pessoa b = new Pessoa("Júlia", "feminino");
        Pessoa c = new Pessoa("Carlos", "masculino");
        Pessoa d = new Pessoa("Antonia", "feminino");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        System.out.println("Genero Masculino: ");
        for (Pessoa pessoa : lista) {
            if("masculino".equals(pessoa.genero)){
                System.out.println("Nome: " + pessoa.nome + ", Gênero: " + pessoa.genero);
            }
        }
        System.out.println("\nGenero Feminino: ");
        for (Pessoa pessoa : lista) {
            if("feminino".equals(pessoa.genero)){
                System.out.println("Nome " + pessoa.nome + ", Gênero: " + pessoa.genero);
            }
        }
    }
}