package com.senai.aula04.Herenca.exercicios.exercicio05_sistema_de_biblioteca;

public class LivroDigital extends Livro{
    double tamanhoArquivo;

    public LivroDigital(String autor, String titulo, double tamanhoArquivo) {
        super(autor, titulo);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return super.toString() + " tamanho do arquivo = " + tamanhoArquivo+ " MB";
    }
}
