package com.senai.aula06.abstracao.exercicios.ex1_sistema_padronizado_de_checkin;

public interface CheckIn {
    double PESO_MAXIMO_BAG = 10;

    static void mensagemPadrao(){
        System.out.println("\nFlySecure, nossa empresa responsável pela segurança aérea.");
    }

    void validacaoDosDocumento();

    default void emitirCartaoDeEmbarque(double peso){
        if (validarBag(peso)){
            System.out.print("Cartão aceito pela empresa: ");
        }else{
            System.out.print("Cartão recusado pela empresa: ");
        }
    }

    static boolean validarBag(double peso){
        return (PESO_MAXIMO_BAG >= peso);
    }
}
