package br.com.rpoffo.factory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O combustível " + fuelSource + " foi abastecido. O maquinário foi iniciado e está pronto para usar com: " + horsePower + " cavalos de potência!");
    }
    public void fuelCar(){
        System.out.println("O carro está sendo preenchido com o combustível: " + fuelSource.toLowerCase());
    }

    public void clean(){
        System.out.println("O carro foi limpo e a cor " + color.toLowerCase() + " brilha");

    }
    public void mechanicCheck(){
        System.out.println("O carro teve seu maquinário checado. Tudo parece funcional!");
    }
}
