package br.com.desafiomobiauto.observer;

public class UsuarioCriadoEventoObserverMailSender implements UsuarioCriadoEventoObserver {
    @Override
    public void notificar(UsuarioCriadoEvento evento) {
        System.out.println("--------------------- E-mail ---------------------");
        System.out.printf("Enviando e-mail de notificação para o cliente de e-mail: %s%n",
                evento.getEmail());
        System.out.println("--------------------- E-mail ---------------------");
    }
}
