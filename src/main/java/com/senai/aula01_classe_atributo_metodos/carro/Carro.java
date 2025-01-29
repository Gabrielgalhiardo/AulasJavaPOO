package com.senai.aula01_classe_atributo_metodos.carro;

import java.util.Objects;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int anoFabricacao;
    double motor;
    byte portas;
    double precoBase;

    public Carro(String marca, String modelo, String cor, int anoFabricacao, double motor, byte portas, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.motor = motor;
        this.portas = portas;
        this.precoBase = precoBase;
    }

    public void verificarInformacoes() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Cor = " + cor);
        System.out.println("anoFabricação = " + anoFabricacao);
        System.out.println("Motor = " + motor);
        System.out.println("Portas = " + portas);
    }

    public void ligar() {
        System.out.println("Vrrum");
    }

    public void testarSom() {
        System.out.println("ligando o som");
    }

    public void buzinar() {
        System.out.println("bibi");
    }

    public void consultarPreso(int anoAtual) {
        int idadeDoCarro = anoAtual - anoFabricacao;
        double precoAtual = precoBase;

        for (int vezes = 0; vezes < idadeDoCarro; vezes++) {
            precoAtual -= (precoAtual * 0.05);
        }
        System.out.println("O atual é de: " + precoAtual);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motor=" + motor +
                ", portas=" + portas +
                ", precoBase=" + precoBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return anoFabricacao == carro.anoFabricacao && Double.compare(motor, carro.motor) == 0 && portas == carro.portas && Double.compare(precoBase, carro.precoBase) == 0 && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cor, anoFabricacao, motor, portas, precoBase);
    }
}