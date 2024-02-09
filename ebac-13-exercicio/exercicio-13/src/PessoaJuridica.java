class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
    }
}
