import br.com.rpoffo.anotacao.Tabela;
import br.com.rpoffo.anotacao.MinhaClasse;

public class Main {
    public static void main(String[] args) {
        Class<?> minhaClasse = MinhaClasse.class;

        imprimeNomeTabela(minhaClasse);
    }

    private static void imprimeNomeTabela(Class<?> minhaClasse) {
        if (minhaClasse.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = minhaClasse.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nomeTabela();
            System.out.println("Nome da Tabela: " + nomeTabela);
        } else {
            System.out.println("A classe não possui a annotation Tabela.");
        }
    }
}
