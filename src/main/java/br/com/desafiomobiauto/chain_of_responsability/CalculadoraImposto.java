package br.com.desafiomobiauto.chain_of_responsability;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraImposto {
    private final List<Imposto> impostos;

    public CalculadoraImposto() {
        super();
        this.impostos = new ArrayList<>();
    }
    public void add(Imposto imposto) {
        impostos.add(imposto);
    }

    public BigDecimal calcular(Custeavel temCusto) {
        for (Imposto imposto: impostos) {
            final BigDecimal valorFinal = imposto.calcular(temCusto);
            if (valorFinal != null) {
                return valorFinal;
            }
        }

        return null;
    }
}
