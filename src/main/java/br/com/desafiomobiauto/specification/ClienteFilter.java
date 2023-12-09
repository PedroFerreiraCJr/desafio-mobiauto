package br.com.desafiomobiauto.specification;

import br.com.desafiomobiauto.specification.model.Genero;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ClienteFilter {
    private String nome;
    private String telefone;
    private Genero sexo;
}
