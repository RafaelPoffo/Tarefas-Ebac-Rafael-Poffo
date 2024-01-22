//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valorPrimitivo = 42;

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor como tipo wrapper: " + valorWrapper);
    }
}