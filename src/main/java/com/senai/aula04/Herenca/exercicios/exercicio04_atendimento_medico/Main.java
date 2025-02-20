package com.senai.aula04.Herenca.exercicios.exercicio04_atendimento_medico;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcaoUser;
    static List<Paciente> listaDePacientes = new ArrayList<>();

    public static void main(String[] args) {
        String menu = """
                ______________________________________
                | 1. Cadastrar Paciente              |
                | 2. Listar todos Pacientes          |
                | 3. Para Sair                       |
                |____________________________________|
                """;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    listarPacientes();
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

    public static void cadastrarPaciente(){
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        double custoConsulta = 0;
        int desconto = 0;
        do {
        System.out.println("\nO paciente de nome: " + nome + " possue convenio?\nDigite 1 para Sim\nDigite 2 para não");
            opcaoUser = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoUser) {
                case 1:
                    System.out.print("Digite a % de desconto: (0.1 a 100.0) ");
                    desconto = scanner.nextInt();
                    scanner.nextLine();

                    PacienteConvenio pacienteConvenio = new PacienteConvenio(
                            nome,
                            idade,
                            desconto
                    );
                    listaDePacientes.add(pacienteConvenio);
                    break;
                case 2:
                    System.out.print("Digite o custo da cunsulta: R$");
                    custoConsulta = scanner.nextDouble();
                    PacienteParticular pacienteParticular = new PacienteParticular(
                            nome,
                            idade,
                            custoConsulta
                    );
                listaDePacientes.add(pacienteParticular);
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (!(opcaoUser > 0 && opcaoUser <= 3));

    }
    public static void listarPacientes(){
        for (int pacientes = 0; pacientes < listaDePacientes.size(); pacientes++) {
            System.out.println(pacientes+1+ "°\n" + listaDePacientes.get(pacientes) + "\n---------------------------------------------------");
        }
    }
}
