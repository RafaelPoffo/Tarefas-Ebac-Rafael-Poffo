public class Cliente {

    // Esta classe possui os valores do cliente comprador
    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getEndereco() {
        return endereco;
    }

    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco(){
        System.out.println(this.endereco);
    }

    public void cadastrarNome(String nome){
        setNome(nome);
    }
    public void imprimirNome(){
        System.out.println(this.nome);
    }

    public int retornarIdade(){
        return 30;
    }

}
