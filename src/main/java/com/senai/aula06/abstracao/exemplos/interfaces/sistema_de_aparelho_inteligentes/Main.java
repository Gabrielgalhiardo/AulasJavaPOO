package com.senai.aula06.abstracao.exemplos.interfaces.sistema_de_aparelho_inteligentes;

public class Main {
    public static void main(String[] args) {
        AparelhoInteligente.mensagemBemVindo();
        testeAparelhos(new TvSmart());
        testeAparelhos(new LampadaInteligente());
    }

    private static void testeAparelhos(AparelhoInteligente aparelhoInteligente){
        System.out.println("---------------------------Teste aparelhos---------------");

        aparelhoInteligente.ligar();
        if (aparelhoInteligente instanceof TvSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.baixarVolume();
            tvSmart.baixarVolume();
            tvSmart.baixarVolume();
        } else if (aparelhoInteligente instanceof LampadaInteligente lampada) {
            lampada.aumentalBrilho();
            lampada.aumentalBrilho();
            lampada.baixarBrilho();
            lampada.baixarBrilho();

        }
        aparelhoInteligente.desligar();
    }
}
