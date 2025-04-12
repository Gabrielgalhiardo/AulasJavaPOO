package com.senai.aula05_polimorfismo.exercicios.ex5_sistema_de_beneficios_de_funcionarios;

import com.senai.aula05_polimorfismo.exercicios.ex4_sistema_de_monitoramento_de_sensores.Sensor;

public class Main {
    public static void main(String[] args) {
        testarClasses(new AuxilioTransporte("Gabriel", 24567.6, 2346));
        testarClasses(new PlanoDeSaude("Mickaela", 42405.4, 7000));
        testarClasses(new ValeAlimentacao("Giovanna", 12567.2, 1500));
    }
    public static void testarClasses(Beneficios beneficios){
        System.out.println("--------------------------------------------");
        beneficios.getNome();
        beneficios.descontoSalarial();
    }
}
