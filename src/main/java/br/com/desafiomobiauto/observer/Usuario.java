package br.com.desafiomobiauto.observer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String senha;
}
