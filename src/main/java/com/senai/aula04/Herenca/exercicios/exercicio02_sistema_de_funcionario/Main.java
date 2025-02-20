package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;

import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcaoUser;

    public static void main(String[] args) {
        String menu = """
                ______________________________________
                | 1. Cadastrar funcionario           |
                | 2. Listar Funcionarios             |
                | 3. Listar Funcionarios             |
                | 4. Para Sair                       |
                |____________________________________|
                """;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcaoUser != 4);
        scanner.close();
    }

}
