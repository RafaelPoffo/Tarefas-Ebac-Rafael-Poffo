package br.com.rpoffo.factory;

public class SemContratosFactory extends Factory{
    @java.lang.Override
    Car retrieveCar(java.lang.String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Gol(50, "alcool", "amarela");
        } else {
            return null;
        }
    }
}
