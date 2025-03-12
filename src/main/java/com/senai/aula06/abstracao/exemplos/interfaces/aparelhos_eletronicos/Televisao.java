package com.senai.aula06.abstracao.exemplos.interfaces.aparelhos_eletronicos;

public class Televisao implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("Tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada");
    }
}
