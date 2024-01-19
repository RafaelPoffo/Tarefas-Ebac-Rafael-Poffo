public class Aluno {
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public Aluno (double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void verificarAprovacao() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6.0) {
            System.out.println("O aluno foi aprovado com a média: " + media);
        } else {
            System.out.println("O aluno foi reprovado com a média: " + media);
        }
    }
}