public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
    }
}
