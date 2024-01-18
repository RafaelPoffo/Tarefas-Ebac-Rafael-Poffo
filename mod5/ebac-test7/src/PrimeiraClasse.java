public class PrimeiraClasse {

    /**
     * @author Rafael.Poffo
     * @since version1
     * @param args
     */
    public static void main (String args[]) {
        Cliente cliente = new Cliente();

        System.out.print("Nome do Usuário: ");
        cliente.cadastrarNome("Rafael");
        cliente.imprimirNome();

        // System.out.println("Nome do Usuario: Rafael");

        int end = cliente.retornarIdade();
        System.out.print("Idade: ");
        System.out.println(end);

        cliente.setCodigo(16456);
        System.out.print("Código Usuário: ");
        System.out.println(cliente.getCodigo());

        cliente.cadastrarEndereco("São Paulo - Rua Panamá nº12");
        cliente.imprimirEndereco();

        Produto produto = new Produto();
        produto.setNomeProduto("Skate");
        produto.setCodigoProduto(48);

        System.out.print("Produto: ");
        produto.imprimirNomeProduto();
        System.out.print("Código do Produto: ");
        produto.imprimirCodigoProduto();


    }
}
