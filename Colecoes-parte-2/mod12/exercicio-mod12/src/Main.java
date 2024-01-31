public class Main {
    public static void main (String args[]) {
        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = new Pessoa("Rafael", "masculino");
        pessoas[1] = new Pessoa("Júlia", "feminino");
        pessoas[2] = new Pessoa("Carlos", "masculino");
        pessoas[3] = new Pessoa("Antonia", "feminino");

        System.out.println("Pessoas do Gênero Masculino: ");
        for (Pessoa pessoa : pessoas) {
            if("masculino".equals(pessoa.genero)){
                System.out.println("Nome: " + pessoa.nome + ", Gênero: " +pessoa.genero);
            }
        }
        System.out.println("\nPessoas do Gênero Feminino: ");
        for (Pessoa pessoa : pessoas) {
            if("feminino".equals(pessoa.genero)){
                System.out.println("Nome " + pessoa.nome + ", Gênero: " +pessoa.genero);
            }
        }
    }
    static class Pessoa {
        String nome;
        String genero;

        public Pessoa (String nome, String genero){
            this.nome = nome;
            this.genero = genero;
        }
    }
}