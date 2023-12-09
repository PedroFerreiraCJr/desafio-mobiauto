package br.com.desafiomobiauto.observer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UsuarioCriadoEvento {
    private String nome;
    private String email;
    private String telefone;
}
