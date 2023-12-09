package br.com.desafiomobiauto.chain_of_responsability;

import java.math.BigDecimal;

public class ImpostoSegundaFaixa implements Imposto {
    @Override
    public BigDecimal calcular(Custeavel temCusto) {
        final BigDecimal custo = temCusto.getCusto();
        if (custo.compareTo(new BigDecimal("2112.0")) > 0 &&
            custo.compareTo(new BigDecimal("2826.65")) <= 0) {
            return custo.multiply(new BigDecimal("1.075"));
        }
        return null;
    }
}
