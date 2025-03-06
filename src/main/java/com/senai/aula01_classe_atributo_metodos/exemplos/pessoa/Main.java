package com.senai.aula01_classe_atributo_metodos.exemplos.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Catanduva",44, "batatanduva", "SBT", 1536620);
        Pessoa pessoa1 = new Pessoa("gabriel", 17, endereco1);

        System.out.println(pessoa1);
        pessoa1.falar();
        System.out.println(pessoa1.endereco.rua);

        Pessoa pessoa2 = new Pessoa(
                "guguTarado",
                17,
                new Endereco(
                        "bigas",
                        6232,
                        "justangoios",
                        "JP",
                        132323124
                )
        );

        Pessoa pessoa3 = new Pessoa(
                "Bolota",
                23,
                new Endereco(
                        "tilambu",
                        872,
                        "Sao jusdeus",
                        "AL",
                        86345678
                )
        );
        Pessoa[]pessoas = new Pessoa[3];
        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;
        pessoas[2] = pessoa3;

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
        ArrayList pessoasList = new ArrayList<>();

        pessoasList.add(pessoa1);
        pessoasList.add(pessoa2);
        pessoasList.add(pessoa3);
        pessoasList.add(new Pessoa("adsadsad", 232, endereco1));
        pessoasList.add("teste");
        pessoasList.add(234);
        pessoasList.add(true);

        System.out.println(pessoasList.get(5));
        pessoasList.remove(5);
        System.out.println(pessoasList.get(5));

        System.out.println(pessoasList.indexOf("teste"));

        System.out.println(pessoasList.isEmpty());


    }
}
