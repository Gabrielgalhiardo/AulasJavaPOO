package com.senai.aula05_polimorfismo.exercicios.ex3_gestao_de_produtos;

import com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega.BicicletaEntrega;
import com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega.CarroEntrega;
import com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega.MotoEntrega;
import com.senai.aula06.abstracao.exercicios.ex2_controle_de_entrega.Veiculo;

public class Main {
    public static void main(String[] args) {
        testarClasses(new ProdutoDigital("Audio livro",53));
        testarClasses(new ProdutoFisico("Celular", 1250));
        testarClasses(new ProdutoServico("Medico", 146));
    }
    public static void testarClasses(Produto produto){
        System.out.println("--------------------------------------------");
       produto.getNome();
       produto.precoFinal();
    }
}
