package com.senai.Aula02_colecoes_em_java.Exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();


    public static void main(String[] args) {
        menuPrincipal();


        scanner.close();
    }

    public static void menuPrincipal() {
        String menu = """
                ______________________________________
                | 1. Adicionar Tarefa                |
                | 2. Listar Tarefas                  |
                | 3. Marcar Tarefa como concluidas   |
                | 4. Remover Tarefa                  |
                | 5. Sair                            |
                |____________________________________|
                """;
        int opcaoUser;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    adicionarNovaTarefa();
                    menuPrincipal();
                    break;
                case 2:
                    listarTarefas();
                    menuPrincipal();
                    break;
                case 3:
                    marcarTarefaComoConcluida();
                    menuPrincipal();
                    break;
                case 4:
                    removerTarefa();
                    menuPrincipal();
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcaoUser != 5);
    }

    public static void adicionarNovaTarefa() {
        System.out.println("Digite uma Tarefa que deseja adicionar");
        String novaTarefa = scanner.nextLine();
        listaDeTarefas.add(new Tarefa(novaTarefa, false));
        System.out.println("Tarefa adicionada com sucesso");
    }

    public static void listarTarefas() {
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println((listaDeTarefas.indexOf(tarefa) + 1) + " - " + tarefa);
        }

    }

    public static void marcarTarefaComoConcluida() {
        listarTarefas();
        System.out.println("Digite o id da tarefa que deseja marcar como concluida");
        listaDeTarefas.get(scanner.nextInt()-1).statusDeConclusão = true;
        scanner.nextLine();
        System.out.println("Tarefa atualizada como concluida");
        listarTarefas();
    }

    public static void removerTarefa() {
        listarTarefas();
        System.out.println("Digite o id da tarefa quem voce quer deletar");
        listaDeTarefas.remove(scanner.nextInt() - 1);
        scanner.nextLine();
        System.out.println("Tarefa removida com sucesso");

    }
}
