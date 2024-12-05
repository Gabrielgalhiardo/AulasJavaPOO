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
    public static void menuPrincipal (){
        String menu = """
                ______________________________________
                | 1. Adicionar Tarefa                |
                | 2. Listar Taredas                  |
                | 3. Marcar Tarefa como concluidas   |
                | 4. Remover Tarefa                  |
                | 5. Sair                            |
                |____________________________________|
                """;
        System.out.println(menu);
        int opcaoUser = scanner.nextInt();
        scanner.nextLine();
        do {
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
        }while (opcaoUser <0 && opcaoUser >6);
    }

    public static void adicionarNovaTarefa() {
        System.out.println("Digite uma Tarefa que deseja adicionar");
        String novaTarefa = scanner.nextLine();
        listaDeTarefas.add(new Tarefa(novaTarefa,false));
    }

    public static void listarTarefas() {
        for (Tarefa tarefa :listaDeTarefas){
            System.out.println(listaDeTarefas.indexOf(tarefa)+ " - " +tarefa);
        }

    }

    public static void marcarTarefaComoConcluida() {

    }

    public static void removerTarefa() {

    }
}
