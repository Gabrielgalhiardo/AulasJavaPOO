package com.senai.aula04_heranca.exemplos.exemplo_veiculos;

public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);

        if (portas <= 7){
            this.portas = portas;
        }else{
            System.out.println("Portas invalidas!");
            return;
        }
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Portas: " + portas);
    }
}
