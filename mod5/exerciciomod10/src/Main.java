//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Digite a nota 1: ");
        int nota1 = a.nextInt();

        Scanner b = new Scanner (System.in);
        System.out.println("Digite a nota 2: ");
        int nota2 = b.nextInt();

        Scanner c = new Scanner (System.in);
        System.out.println("Digite a nota 3: ");
        int nota3 = c.nextInt();

        Scanner d = new Scanner (System.in);
        System.out.println("Digite a nota 4: ");
        int nota4 = d.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7) {
            System.out.println("O aluno foi aprovado com a nota: " + media);
        } else if (media >= 5){
            System.out.println("O aluno está de recuperação com a nota: " + media);
        } else {
            System.out.println("O aluno foi reprovado com a nota: " + media);
        }
    }

}