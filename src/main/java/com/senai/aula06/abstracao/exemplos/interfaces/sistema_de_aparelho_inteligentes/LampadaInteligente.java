package com.senai.aula06.abstracao.exemplos.interfaces.sistema_de_aparelho_inteligentes;

public class LampadaInteligente implements AparelhoInteligente{
    private int brilho;

    public LampadaInteligente() {
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lampada ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada desligada!");
    }

    public void  aumentalBrilho(){
        System.out.println("Brilho " + (brilho = ajutarNivel(brilho, 1)));
    }

    public void  baixarBrilho(){
        System.out.println("Brilho " + (brilho = ajutarNivel(brilho, -1)));
    }
}
