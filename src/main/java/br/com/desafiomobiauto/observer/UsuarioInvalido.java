package br.com.desafiomobiauto.observer;

public class UsuarioInvalido extends RuntimeException {
    public UsuarioInvalido(String message) {
        super(message);
    }
}
