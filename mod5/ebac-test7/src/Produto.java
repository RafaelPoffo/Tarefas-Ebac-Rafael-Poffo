public class Produto {
    //Esta classe possui as informações do produto vendido
    public int codigoProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public java.lang.String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(java.lang.String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String nomeProduto;

    public void imprimirNomeProduto() {
        System.out.println(this.nomeProduto);
    }
    public void imprimirCodigoProduto(){
        System.out.println(this.codigoProduto);
    }
}
