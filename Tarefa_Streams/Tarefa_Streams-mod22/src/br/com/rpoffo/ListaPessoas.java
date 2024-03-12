import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaPessoas {
    private List<Pessoa> pessoas;

    public ListaPessoas() {
        pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Pedro", "Masculino"));
        pessoas.add(new Pessoa("Mariana", "Feminino"));
        pessoas.add(new Pessoa("Lucas", "Masculino"));
    }

    public List<Pessoa> filtrarGeneroFeminino() {
        return pessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ListaPessoas listaPessoas = new ListaPessoas();
        List<Pessoa> mulheres = listaPessoas.filtrarGeneroFeminino();
        System.out.println("Pessoas do gênero feminino:");
        mulheres.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}
