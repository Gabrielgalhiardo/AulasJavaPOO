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
    public void emitirCartaoDeEmbarque() {
        if (validarBag(peso)){
            System.out.println("Cartão emitido pela empresa Latam");
        }else{
            System.out.println("Bagagem muito pessada,Cartão Recusado pela Latam");
        }
    }

}
