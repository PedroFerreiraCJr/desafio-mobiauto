package br.com.desafiomobiauto.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UsuarioCriadoEventoObservableImpl implements UsuarioCriadoEventoObservable {
    private final List<EventoObserver<UsuarioCriadoEvento>> listeners;
    public UsuarioCriadoEventoObservableImpl() {
        super();
        this.listeners = new ArrayList<>();
    }
    @Override
    public void inscrever(EventoObserver<UsuarioCriadoEvento> observer) {
        if (Objects.isNull(observer)) {
            throw new IllegalArgumentException("Parâmetro 'observer' não pode ser nulo");
        }
        this.listeners.add(observer);
    }
    @Override
    public void remover(EventoObserver<UsuarioCriadoEvento> observer) {
        if (Objects.isNull(observer)) {
            throw new IllegalArgumentException("Parâmetro 'observer' não pode ser nulo");
        }
        this.listeners.remove(observer);
    }
    @Override
    public void notificar(UsuarioCriadoEvento evento) {
        final UsuarioCriadoEvento usuarioCriadoEvento = UsuarioCriadoEvento.builder()
                .nome(evento.getNome())
                .email(evento.getEmail())
                .telefone(evento.getTelefone())
                .build();
        this.listeners.forEach(observer -> {
            observer.notificar(usuarioCriadoEvento);
        });
    }
}
