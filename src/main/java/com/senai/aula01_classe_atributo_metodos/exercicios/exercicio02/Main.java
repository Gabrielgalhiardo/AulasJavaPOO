package com.senai.aula01_classe_atributo_metodos.exercicios.exercicio02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "Gabriel",
                17,
                1F
        );
        Aluno aluno2 = new Aluno(
                "Igor",
                21,
                9F
        );
        Aluno aluno3 = new Aluno(
                "Bia",
                19,
                9F
        );
        aluno2.atualizarNota();
        ArrayList<Aluno> listAlunos = new ArrayList<>();
        listAlunos.add(aluno1);
        listAlunos.add(aluno2);
        listAlunos.add(aluno3);

        for (Aluno aluno: listAlunos) {
            System.out.println(aluno);
        }

        for (Aluno aluno: listAlunos) {
            if (aluno.verificarAprovacao(aluno.nota))
                System.out.println("O aluno: " + aluno + " passou de ano!");
            else
                System.out.println("O aluno: " + aluno + " não passou de ano!");
        }
    }
}
