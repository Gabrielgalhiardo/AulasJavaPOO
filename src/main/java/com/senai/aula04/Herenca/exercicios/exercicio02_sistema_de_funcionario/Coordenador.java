package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;
import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionarios {
    private List<Professor> equipeDeProfessores = new ArrayList<>();

    public Coordenador(double salario, String nome, List<Professor> equipeDeProfessores) {
        super(salario, nome);
        this.equipeDeProfessores = equipeDeProfessores;
    }

    public List<Professor> getEquipeDeProfessores() {
        return equipeDeProfessores;
    }

    public void setEquipeDeProfessores(List<Professor> equipeDeProfessores) {
        this.equipeDeProfessores = equipeDeProfessores;
    }
}


