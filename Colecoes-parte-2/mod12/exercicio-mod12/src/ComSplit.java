public class ComSplit {
    public static void main(String args[]) {
        comsplit(args);
    }

    public static void comsplit(String args[]) {
        String[] dadosPessoas = {
                "Rafael,masculino",
                "Júlia,feminino",
                "Carlos,masculino",
                "Antonia,feminino"
        };
        Pessoa[] pessoas = new Pessoa[4];

        for (int i = 0; i < dadosPessoas.length; i++) {
            String[] dados = dadosPessoas[i].split(",");
            String nome = dados[0];
            String genero = dados[1];
            pessoas[i] = new Pessoa(nome, genero);
        }
        System.out.println("Pessoas do Gênero Masculino: ");
        for (Pessoa pessoa : pessoas) {
            if ("masculino".equals(pessoa.genero)) {
                System.out.println("Nome: " + pessoa.nome + ", Gênero: " + pessoa.genero);
            }
        }
        System.out.println("\nPessoas do Gênero Feminino: ");
        for (Pessoa pessoa : pessoas) {
            if ("feminino".equals(pessoa.genero)) {
                System.out.println("Nome: " + pessoa.nome + ", Gênero: " + pessoa.genero);
            }
        }
    }

    static class Pessoa {
        String nome;
        String genero;

        public Pessoa(String nome, String genero) {
            this.nome = nome;
            this.genero = genero;
        }
    }
}