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
    public void emitirCartaoDeEmbarque() {
        if (validarBag(peso)){
            System.out.println("Cartão emitido pela empresa GOL");
        }else{
            System.out.println("Bagagem muito pessada,Cartão Recusado pela GOL");
        }
    }
}
