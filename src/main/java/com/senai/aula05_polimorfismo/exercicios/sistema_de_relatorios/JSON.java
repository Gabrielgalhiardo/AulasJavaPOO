package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class JSON extends Relatorio{
    @Override
    public void gerar() {
        System.out.println("Gerou um Relatorio em JSON");
    }
}
