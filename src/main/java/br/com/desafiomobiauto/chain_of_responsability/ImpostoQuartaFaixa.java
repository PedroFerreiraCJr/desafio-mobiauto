package br.com.desafiomobiauto.chain_of_responsability;

import java.math.BigDecimal;

public class ImpostoQuartaFaixa implements Imposto {
    @Override
    public BigDecimal calcular(Custeavel temCusto) {
        final BigDecimal custo = temCusto.getCusto();
        if (custo.compareTo(new BigDecimal("3751.05")) > 0 &&
            custo.compareTo(new BigDecimal("4664.68")) <= 0) {
            return custo.multiply(new BigDecimal("1.225"));
        }
        return null;
    }
}
