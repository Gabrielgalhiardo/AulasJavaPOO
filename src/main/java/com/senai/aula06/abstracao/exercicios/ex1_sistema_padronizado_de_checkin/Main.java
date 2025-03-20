package com.senai.aula06.abstracao.exercicios.ex1_sistema_padronizado_de_checkin;

public class Main {
    public static void main(String[] args) {
        testeChekIn(new CheckInGol(11));
        testeChekIn(new CheckInLatam(8));
    }
    private static void testeChekIn (CheckIn checkIn){
        CheckIn.mensagemPadrao();
        if (checkIn instanceof CheckInGol checkInGol){
            checkInGol.validacaoDosDocumento();
            checkInGol.emitirCartaoDeEmbarque();
        } else if (checkIn instanceof  CheckInLatam checkInLatam) {
            checkInLatam.validacaoDosDocumento();
            checkInLatam.emitirCartaoDeEmbarque();
        }
    }
}
