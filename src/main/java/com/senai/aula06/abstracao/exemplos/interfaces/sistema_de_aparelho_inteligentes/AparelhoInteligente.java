package com.senai.aula06.abstracao.exemplos.interfaces.sistema_de_aparelho_inteligentes;

public interface AparelhoInteligente {
    int NIVEL_MAXIMO = 100;

    void ligar();
    void desligar();

    default int ajutarNivel(int nivelAtual, int ajuste){
        if (validarNivel(nivelAtual, ajuste)){
            return nivelAtual+ajuste;
        }else {
            return nivelAtual;
        }
    }

    static void mensagemBemVindo(){
        System.out.println("Bem-vindo ao Controle Remoto Inteligente!");
    }

    private boolean validarNivel(int nivel, int ajuste){
        return (nivel >= 0) && (nivel<=NIVEL_MAXIMO) && (nivel+ajuste !=-1) && (nivel+ajuste!= 101);
    }
}
