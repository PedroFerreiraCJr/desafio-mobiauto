package br.com.desafiomobiauto.observer;

public class UsuarioCriadoEventoObserverSmsSender implements UsuarioCriadoEventoObserver {
    @Override
    public void notificar(UsuarioCriadoEvento evento) {
        System.out.println("--------------------- SMS ---------------------");
        System.out.printf("Enviando SMS de notificação para o cliente de telefone: %s%n",
                evento.getTelefone());
        System.out.println("--------------------- SMS ---------------------");
    }
}
