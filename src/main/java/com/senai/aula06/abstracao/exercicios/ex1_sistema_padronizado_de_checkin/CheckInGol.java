package com.senai.aula06.abstracao.exercicios.ex1_sistema_padronizado_de_checkin;

import java.sql.SQLOutput;

public class CheckInGol implements CheckIn{
    private double peso;

    public CheckInGol(double peso) {
        this.peso = peso;
    }

    @Override
    public void validacaoDosDocumento() {
        System.out.println("Documentos validados pela empresa GOl");
    }


    @Override
    public void emitirCartaoDeEmbarque(double peso) {
        CheckIn.super.emitirCartaoDeEmbarque(peso);
        System.out.print("GOL");
    }

    public double getPeso() {
        return peso;
    }
}
