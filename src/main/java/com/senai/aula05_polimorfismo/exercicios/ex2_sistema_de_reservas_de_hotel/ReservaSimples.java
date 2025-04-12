package com.senai.aula05_polimorfismo.exercicios.ex2_sistema_de_reservas_de_hotel;

public class ReservaSimples extends Reserva{
    @Override
    public void calcularCustoTotal(int diasHospedados) {
        double valorTotal = diasHospedados*234;
        System.out.println("O valor total da hospedagem Simples = " + valorTotal + " reais.");
    }
}
