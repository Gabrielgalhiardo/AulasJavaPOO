package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;

import com.senai.aula04.Herenca.exercicios.exercicio01_controle_de_estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Professor> listaProfessores = new ArrayList<>();
    static List<Coordenador> listaCordenadores = new ArrayList<>();
    static int opcaoUser;

    public static void main(String[] args) {
        String menu = """
                
                ______________________________________
                | 1. Cadastrar Funcionario           |
                | 2. Listar Professores              |
                | 3. Listar Cordenadores             |
                | 4. Para Sair                       |
                |____________________________________|
                """;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    listarProfessores();
                    break;
                case 3:
                    listarCordenadores();
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

    public static void cadastrarFuncionario(){
        System.out.println("Digite 1 para cadastrar Professor\nDigite 2 para cadastrar Cordenador");
        do {
        opcaoUser = scanner.nextInt();
        scanner.nextLine();

        }while (!(opcaoUser > 0 && opcaoUser <= 2));

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();



        System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();

        if ( opcaoUser == 1){
            System.out.print("Digite a materia do professor " + nome + ": ");
            String materia = scanner.nextLine();

            Professor professor = new Professor(
              nome,
              salario,
              materia
            );

            listaProfessores.add(professor);
        }else{
            Coordenador coordenador = new Coordenador(
                    nome,
                    salario,
                    null
            );

            listaCordenadores.add(coordenador);
        }
    }

    public static void listarProfessores(){
        for (Professor professor : listaProfessores){
            System.out.println((listaProfessores.indexOf(professor) + 1) + "- \n " + professor);
        }
    }



    public static void listarCordenadores(){
        for (Coordenador coordenador : listaCordenadores){
            System.out.println(listaProfessores.indexOf(coordenador) + 1 + "- \n " + coordenador);
        }
    }


}
