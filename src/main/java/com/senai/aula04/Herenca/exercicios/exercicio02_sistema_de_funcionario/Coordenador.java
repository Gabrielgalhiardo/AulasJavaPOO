package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;
import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionarios {
    private List<Professor> equipeDeProfessores = new ArrayList<>();

    public Coordenador(String nome, double salario, List<Professor> equipeDeProfessores) {
        super(nome, salario);
        this.equipeDeProfessores = equipeDeProfessores;
    }

    public List<Professor> getEquipeDeProfessores() {
        return equipeDeProfessores;
    }

    public void setEquipeDeProfessores(List<Professor> equipeDeProfessores) {
        this.equipeDeProfessores = equipeDeProfessores;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "equipeDeProfessores=" + equipeDeProfessores +
                '}';
    }
}


