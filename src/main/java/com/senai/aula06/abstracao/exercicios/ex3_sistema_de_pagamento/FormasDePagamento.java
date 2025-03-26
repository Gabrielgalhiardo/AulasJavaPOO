package com.senai.aula06.abstracao.exercicios.ex3_sistema_de_pagamento;

import java.util.ArrayList;
import java.util.List;

public abstract class FormasDePagamento {
    protected String nome;
    protected String cpf;
    protected double valor;

    public void autenticacaoDoUsuario(){

    }

    public void validacaoAntifraude(){

    }

    public void registroDaTrasacao(){

    }

    protected abstract void registroDeLogs();

    protected abstract void validacao();



}
