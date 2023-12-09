package br.com.desafiomobiauto.chain_of_responsability;

import java.math.BigDecimal;

public class Funcionario implements Custeavel {
    private final BigDecimal salario;

    public Funcionario(BigDecimal salario) {
        super();
        this.salario = salario;
    }

    @Override
    public BigDecimal getCusto() {
        return this.salario;
    }
}
