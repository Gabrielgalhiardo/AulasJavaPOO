package com.senai.Aula01_classe_atributo_metodos.carro;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro("honda", "zflip", "amarilho", 1990,1.6, (byte)8,3200000);
        System.out.println(carro1);

        carro1.verificarInformacoes();
        carro1.ligar();
        carro1.buzinar();
        carro1.consultarPreso(2024);
        carro1.testarSom();



        Carro carro2 = new Carro("honda", "zflip", "amarilho", 1990,1.6, (byte)8,3200000);

        carro2.verificarInformacoes();
        carro2.consultarPreso(2024);


        Carro carro3 = new Carro("honda", "zflip", "amarilho", 1990,1.6, (byte)8,3200000);


        carro3.verificarInformacoes();
        carro3.consultarPreso(2024);

        carro1 = carro2;

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);


        System.out.println(carro2.modelo);

        String texto = "teste";
        System.out.println(texto);

        System.out.println(carro2.equals(carro3));
    }

}
