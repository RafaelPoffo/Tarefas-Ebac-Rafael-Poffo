public class Programa {
    public static void main(String args[]) {
        PessoaFisica pessoaFisica = new PessoaFisica("Rafael", "545646513");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa Max", "32.654.7654/498494-49");

        pessoaFisica.exibirInformacoes();
        System.out.println();
        pessoaJuridica.exibirInformacoes();
    }
}
