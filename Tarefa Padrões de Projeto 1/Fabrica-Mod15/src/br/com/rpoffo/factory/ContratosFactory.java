package br.com.rpoffo.factory;

public class ContratosFactory extends Factory{
    @java.lang.Override
    Car retrieveCar(java.lang.String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new Palio(100,"gasolina", "azul" );
        } else {
            return null;
        }
    }
}
