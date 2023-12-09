package br.com.desafiomobiauto.chain_of_responsability;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Custeavel temCusto);
}
