package com.senai.aula04.Herenca.exercicios.exercicio05_sistema_de_biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcaoUser;
    static List<Livro> listaDeLivros = new ArrayList<>();

    public static void main(String[] args) {
        String menu = """
                ______________________________________
                | 1. Cadastrar livro                 |
                | 2. Listar todos os livros          |
                | 3. Para Sair                       |
                |____________________________________|
                """;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    listarlivros();
                    break;
                case 3:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcaoUser != 3);
        scanner.close();
    }

    public static void cadastrarLivro() {

        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        int numeroDePaginas = 0;
        double tamanhoLivro = 0.0;

        do {
            System.out.println("\nO livro de titulo: " + titulo + " é digital?\nDigite 1 para Sim\nDigite 2 para não");
            opcaoUser = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoUser) {
                case 1:
                    System.out.print("Digite o tamanho dele em MB: ");
                    tamanhoLivro = scanner.nextDouble();
                    scanner.nextLine();
                    LivroDigital livroDigital = new LivroDigital(
                            autor,
                            titulo,
                            tamanhoLivro
                    );
                    listaDeLivros.add(livroDigital);

                    break;
                case 2:
                    System.out.print("Digite o numero de paginas: ");
                    numeroDePaginas = scanner.nextInt();
                    LivroFisico livroFisico = new LivroFisico(
                            autor,
                            titulo,
                            numeroDePaginas
                    );
                    listaDeLivros.add(livroFisico);
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (!(opcaoUser > 0 && opcaoUser <= 3));
    }

    public static void listarlivros() {
        for (int pacientes = 0; pacientes < listaDeLivros.size(); pacientes++) {
            System.out.println(pacientes + 1 + "°\n" + listaDeLivros.get(pacientes) + "\n---------------------------------------------------");
        }
    }
}
