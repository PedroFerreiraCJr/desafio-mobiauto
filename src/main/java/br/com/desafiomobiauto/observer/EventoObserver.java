package br.com.desafiomobiauto.observer;

public interface EventoObserver<T> {
    public void notificar(T evento);
}
