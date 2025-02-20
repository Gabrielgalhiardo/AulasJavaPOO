package com.senai.aula04.Herenca.exercicios.exercicio05_sistema_de_biblioteca;

public class LivroFisico extends Livro{
    int numeroDePaginas;

    public LivroFisico(String autor, String titulo, int numeroDePaginas) {
        super(autor, titulo);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return super.toString() + " numero de paginas = " + numeroDePaginas;
    }
}
