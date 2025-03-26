package com.senai.aula06.abstracao.exercicios.ex1_sistema_padronizado_de_checkin;

public class CheckInLatam implements CheckIn{
    private double peso;

    public CheckInLatam(double peso) {
        this.peso = peso;
    }

    @Override
    public void validacaoDosDocumento() {
        System.out.println("Documentos validados pela empresa Latam");

    }

    @Override
    public void emitirCartaoDeEmbarque(double peso) {
        CheckIn.super.emitirCartaoDeEmbarque(peso);
        System.out.print("LATAM");
    }

    public double getPeso() {
        return peso;
    }
}
