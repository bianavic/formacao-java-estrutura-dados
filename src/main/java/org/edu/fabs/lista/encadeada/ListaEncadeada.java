package org.edu.fabs.lista.encadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        referenciaEntrada = null;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public int size() {

        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;

        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoLista++;

                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public ListaEncadeada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

}
