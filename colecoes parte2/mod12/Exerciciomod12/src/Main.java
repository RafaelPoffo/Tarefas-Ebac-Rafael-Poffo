//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Pessoa {
            String nome;
            String genero;

            public Pessoa(String nome, String genero) {
                this.nome = nome;
                this.genero = genero;
            }
        }

        public class OrdenarGenero {
            public static void main(String[] args) {
                // Criar array de pessoas
                Pessoa[] pessoas = new Pessoa[4];

                // Adicionar pessoas ao array
                pessoas[0] = new Pessoa("Rafael", "masculino");
                pessoas[1] = new Pessoa("Júlia", "feminino");
                pessoas[2] = new Pessoa("Carlos", "masculino");
                pessoas[3] = new Pessoa("Antonia", "feminino");

                // Imprimir informações das pessoas separadas por gênero
                System.out.println("Pessoas Masculinas:");
                for (Pessoa pessoa : pessoas) {
                    if ("masculino".equals(pessoa.genero)) {
                        System.out.println("Nome: " + pessoa.nome + ", Gênero: " + pessoa.genero);
                    }
                }

                System.out.println("\nPessoas Femininas:");
                for (Pessoa pessoa : pessoas) {
                    if ("feminino".equals(pessoa.genero)) {
                        System.out.println("Nome: " + pessoa.nome + ", Gênero: " + pessoa.genero);
                    }
                }
            }
        }

    }
}