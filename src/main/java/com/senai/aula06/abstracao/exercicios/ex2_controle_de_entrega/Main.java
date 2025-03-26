package com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega;

public class Main {
    public static void main(String[] args) {
        testarClasses(new BicicletaEntrega(31, 10, 11));
        testarClasses(new MotoEntrega(60, 30, 120));
        testarClasses(new CarroEntrega(64, 134, 84));
    }

    public static void testarClasses(Veiculo veiculo){
        System.out.println("--------------------------------------------");
        if (veiculo instanceof BicicletaEntrega bicicletaEntrega){
            bicicletaEntrega.verificardistancialTotal();
            bicicletaEntrega.verificarVelocidadeAtual();
            bicicletaEntrega.calcularTempoEstimado();
            bicicletaEntrega.aumentarVelocidade();
            bicicletaEntrega.aumentarVelocidade();
            bicicletaEntrega.calcularTempoEstimado();
            bicicletaEntrega.freiar();
            bicicletaEntrega.freiar();
            bicicletaEntrega.calcularTempoEstimado();
        } else if (veiculo instanceof MotoEntrega motoEntrega) {
            motoEntrega.verificardistancialTotal();
            motoEntrega.verificarVelocidadeAtual();
            motoEntrega.calcularTempoEstimado();
            motoEntrega.aumentarVelocidade();
            motoEntrega.calcularTempoEstimado();
            motoEntrega.freiar();
            motoEntrega.freiar();
            motoEntrega.calcularTempoEstimado();
        } else if (veiculo instanceof  CarroEntrega carroEntrega) {
            carroEntrega.verificardistancialTotal();
            carroEntrega.verificarVelocidadeAtual();
            carroEntrega.calcularTempoEstimado();
            carroEntrega.aumentarVelocidade();
            carroEntrega.calcularTempoEstimado();
            carroEntrega.freiar();
            carroEntrega.freiar();
            carroEntrega.calcularTempoEstimado();
        }
    }
}
