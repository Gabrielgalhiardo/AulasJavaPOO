package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Pagamentos> listaPagamentos = new ArrayList<>();
    listaPagamentos.add(new CLT("Rafael", 1000));
    listaPagamentos.add(new PJ("gustavo", 80, 100));
    listaPagamentos.add(new Freelancer("igor", 6996));

    listaPagamentos.forEach(p -> System.out.println(p.calcularPagamento()));
    }


}
