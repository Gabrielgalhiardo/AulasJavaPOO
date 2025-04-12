package com.senai.aula05_polimorfismo.exercicios.ex2_sistema_de_reservas_de_hotel;

public class ReservaVip extends Reserva{
    @Override
    public void calcularCustoTotal(int diasHospedados) {
        double valorTotal = diasHospedados*863;
        System.out.println("O valor total da hospedagem VIP = " + valorTotal + " reais.");
    }
}
