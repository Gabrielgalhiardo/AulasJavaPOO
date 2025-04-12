package com.senai.aula05_polimorfismo.exercicios.ex2_sistema_de_reservas_de_hotel;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tipoHospedagem = 0;
        do {
        System.out.println("Digite qual é o tipo de hospedagem:\n1 para Hospedagem Simples\n2 para Hospedagem VIP");
        tipoHospedagem = scanner.nextInt();
        scanner.nextLine();
            int dias = 0;
            switch (tipoHospedagem){
                case 1:
                    System.out.println("Digite a quantidade de dias");
                    dias = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Digite a quantidade de dias");
                    dias = scanner.nextInt();
                    scanner.nextLine();
                    break;
                default:

            }
        }while (tipoHospedagem != 3);





    }
}
