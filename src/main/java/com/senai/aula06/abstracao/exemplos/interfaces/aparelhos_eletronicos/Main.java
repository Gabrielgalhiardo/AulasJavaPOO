package com.senai.aula06.abstracao.exemplos.interfaces.aparelhos_eletronicos;

import com.senai.aula06.abstracao.exemplos.interfaces.sistema_de_aparelho_inteligentes.AparelhoInteligente;

public class Main {
    public static void main(String[] args) {
        System.out.println("testando TV");
        ligarEDesligarAparelhos(new Televisao());

        System.out.println("\n\ntestando PC");
        ligarEDesligarAparelhos(new Computador());


    }

    public static void ligarEDesligarAparelhos(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
