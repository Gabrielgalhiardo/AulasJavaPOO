package com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega;

public abstract class Veiculo {
    protected double velocidadeAtual;
    protected double capacidadeMax;
    protected double distanciaDestino;

    public Veiculo(double velocidadeAtual, double capacidadeMax, double distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMax = capacidadeMax;
        this.distanciaDestino = distanciaDestino;
    }

    public void verificarVelocidadeAtual(){
        System.out.println("Sua velociade atual é de: "+velocidadeAtual+"km/h");
    }

    public void verificardistancialTotal(){
        System.out.println("A distancia total é de: "+distanciaDestino+"km");
    }

    public void aumentarVelocidade(){
        velocidadeAtual+=5;
        System.out.println("Velocidade aumentada para: "+ velocidadeAtual+ "Km/h");
    }

    public void freiar(){
        velocidadeAtual-=5;
        System.out.println("Velocidade reduzida para: " + velocidadeAtual + "Km/h");
    }


    abstract void calcularTempoEstimado();


}
