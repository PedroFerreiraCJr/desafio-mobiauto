package br.com.desafiomobiauto.observer;

import lombok.Getter;

public class CadastroUsuario {
    @Getter
    private final UsuarioCriadoEventoObservable observable;

    public CadastroUsuario() {
        super();
        this.observable = new UsuarioCriadoEventoObservableImpl();
    }

    public void cadastrar(Usuario usuario) {
        if (isUsuarioInvalido(usuario)) {
            throw new UsuarioInvalido("Usuário com informações incorretas");
        }

        UsuarioCriadoEvento evento = UsuarioCriadoEvento.builder()
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .telefone(usuario.getTelefone())
                .build();
        this.observable.notificar(evento);
    }

    private boolean isUsuarioInvalido(Usuario usuario) {
        if (usuario.getNome() == null) {
            return true;
        }

        if (usuario.getTelefone() == null) {
            return true;
        }

        if (usuario.getEmail() == null) {
            return true;
        }

        if (usuario.getSenha() == null) {
            return true;
        }

        return false;
    }
}
