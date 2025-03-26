package com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega;

public class CarroEntrega extends Veiculo{

    public CarroEntrega(double velocidadeAtual, double capacidadeMax, double distanciaDestino) {
        super(velocidadeAtual, capacidadeMax, distanciaDestino);
    }

    @Override
    void calcularTempoEstimado() {
        System.out.println("O tempo que irá levar de carro é de: " + (distanciaDestino / (velocidadeAtual*0.8))*60 + " minutos");
    }
}
