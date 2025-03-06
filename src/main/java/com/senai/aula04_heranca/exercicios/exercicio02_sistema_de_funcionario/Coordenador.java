package com.senai.aula04_heranca.exercicios.exercicio02_sistema_de_funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return"Nome: " + super.getNome() + "\nSalario: " + super.getSalario() + "\nEquipe de professores: \n" + equipeDeProfessores.stream().map(Professor::getNome).collect(Collectors.joining(", "));
    }
}


