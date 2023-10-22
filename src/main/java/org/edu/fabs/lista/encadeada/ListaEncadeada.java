package org.edu.fabs.lista.encadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada; // recebera aquel referencia de entrada
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    // metodo get para retornar o conteudo, nao apenas o nó
    public T get(int indice) {
        return getNo(indice).getConteudo();
    }

    // privado - metodo interno da classe
    // utilidade: qdo implementar metodo remove
    private No<T> getNo(int indice) {

        validaIndice(indice); // se passar indice q nao existe? nullpointerexception

        int ultimoIndice = size() -1;
        if (indice >= size()) {
            throw new IndexOutOfBoundsException("Nao existe conteudo no indice " +indice + " desta lista. A lista só vai até o indice " + ultimoIndice);
        }

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i < this.size() - 1; i++) {
            noRetorno = noAuxiliar; // antes da passagem para proximo no, guarda o retorno
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int indice) {

        No<T> noMirado = this.getNo(indice);

        // indice igual zero -> significa to removendo o primeiro no
        if (indice == 0) {
            referenciaEntrada = noMirado.getProximoNo(); // a referencia do primeiro no sempre sera o seguinte
            return noMirado.getConteudo();
        } else {
            No<T> noAnterior = getNo(indice -1);
            noAnterior.setProximoNo(noMirado.getProximoNo());
            // no return o nó ainda esta presente, mas nao há referencia,
            // qdo a jvm encontra-lo, pq nao tem a referencia, ira remove-lo da lista encadeada
            return noMirado.getConteudo();
        }
    }

    // se passar um indice q nao existe? nullpointerexception
    public void validaIndice(int indice) {
        int ultimoIndice = size() -1;
        if (indice >= size()) {
            throw new IndexOutOfBoundsException("Nao existe conteudo no indice " +indice + " desta lista. A lista só vai até o indice " + ultimoIndice);
        }
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
