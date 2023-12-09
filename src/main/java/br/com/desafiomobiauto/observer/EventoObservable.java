package br.com.desafiomobiauto.observer;

public interface EventoObservable<T> {
    public void inscrever(EventoObserver<T> observer);
    public void remover(EventoObserver<T> observer);

    public void notificar(T evento);
}
