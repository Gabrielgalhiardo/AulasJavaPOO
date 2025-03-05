package com.senai.aula05.polimorfismo.exemplos.sobrecarga_metodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,2));
        System.out.println(calculadora.somar(2,2,3));
        System.out.println(calculadora.somar(2.4f,2.3f));
        System.out.println(calculadora.somar(2,2.0f));
        System.out.println(calculadora.somar(2.0f,3));
    }
}
