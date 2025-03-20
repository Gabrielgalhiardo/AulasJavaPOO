package com.senai.aula06.abstracao.exemplos.interfaces.sistema_de_aparelho_inteligentes;

public class TvSmart implements AparelhoInteligente{
    private int volume;

    @Override
    public void ligar() {
        System.out.println("Tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada");
    }

    public void aumentarVolume(){
        System.out.println("Volume " + (volume = ajutarNivel(volume, 1)));
    }

    public void baixarVolume(){
        System.out.println("Volume " + (volume = ajutarNivel(volume, -1)));
    }
}
