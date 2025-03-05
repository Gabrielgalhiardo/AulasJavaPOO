package com.senai.aula05.polimorfismo.exemplos.sobrecarga_metodos;

public class Calculadora {
    int somar(int a, int b){
        System.out.println("Metodo 1");
        return a+b;
    }
    int somar(int a, int b, int c){
        System.out.println("Metodo 2");
        return a+b+c;
    }
//    void somar(int a, int b, int c){
//        aqui nao muda a assinatura
//    }

    double somar(double a, double b){
        System.out.println("Metodo 3");
        return a+b;
    }

    float somar(int a, float b){
        System.out.println("Metodo 4");
        return a+b;
    }

    float somar(float b, int a){
        System.out.println("Metodo 5");
        return a+b;
    }

}
