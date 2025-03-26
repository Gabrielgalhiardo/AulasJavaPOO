package com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega;

public class BicicletaEntrega extends Veiculo {
    public static final double limiteDeVelocidade = 40;

    public BicicletaEntrega(double velocidadeAtual, double capacidadeMax, double distanciaDestino) {
        super(velocidadeAtual, capacidadeMax, distanciaDestino);

    }

    @Override
    void calcularTempoEstimado() {
        if (limiteDeVelocidade<velocidadeAtual){
            System.out.println("Erro, essa bike está fora do limite de velocidade");
        }else{
        System.out.println("O tempo que irá levar de bicicleta é de: " + (distanciaDestino / (velocidadeAtual*0.6))*60 + " minutos");
        }
    }
}
