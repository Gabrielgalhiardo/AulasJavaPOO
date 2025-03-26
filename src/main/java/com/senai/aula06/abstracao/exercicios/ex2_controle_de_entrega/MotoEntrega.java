package com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega;

public class MotoEntrega extends Veiculo{

    public MotoEntrega(double velocidadeAtual, double capacidadeMax, double distanciaDestino) {
        super(velocidadeAtual, capacidadeMax, distanciaDestino);
    }

    @Override
    void calcularTempoEstimado() {
        System.out.println("O tempo que irá levar de moto é de : " + (distanciaDestino / (velocidadeAtual))*60 + " minutos");
    }
}
