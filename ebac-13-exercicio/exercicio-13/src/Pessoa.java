public abstract class Pessoa {
    private String nome;

    public Pessoa (String nome) {
        this.nome = nome;
    }

    public abstract void exibirInformacoes();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
