package com.senai.aula04_heranca.exemplos.exemplo_veiculos;

public class Moto extends Veiculo{
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        temPartidaEletrica = temPartidaEletrica;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Partida elétrica " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}
