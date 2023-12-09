package br.com.desafiomobiauto.observer;

public class Main {
    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.getObservable()
                .inscrever(new UsuarioCriadoEventoObserverMailSender());
        cadastroUsuario.getObservable()
                .inscrever(new UsuarioCriadoEventoObserverSmsSender());

        cadastroUsuario.cadastrar(
                new Usuario("Pedro", "085996574872",
                        "pedroferreiracjr@gmail.com", "123"));
    }
}
