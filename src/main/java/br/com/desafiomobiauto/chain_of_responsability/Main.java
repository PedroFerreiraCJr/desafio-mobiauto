package br.com.desafiomobiauto.chain_of_responsability;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        calculadora.add(new ImpostoPrimeiraFaixa());
        calculadora.add(new ImpostoSegundaFaixa());
        calculadora.add(new ImpostoTerceiraFaixa());
        calculadora.add(new ImpostoQuartaFaixa());
        calculadora.add(new ImpostoQuintaFaixa());

        Custeavel temCusto = new Funcionario(new BigDecimal("5000.00"));
        BigDecimal valorFinal = calculadora.calcular(temCusto);
        System.out.println(valorFinal);
    }
}
