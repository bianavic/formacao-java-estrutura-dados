package org.edu.fabs.lista.duplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    // sempre q instanciar uma nova classe ListaDuplamenteEncadeada,
    // terei certeza q o tamanhoLista é zero, e q o primeiro e ultimo no serao nulo
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public T get(int indice) {
        return this.getNo(indice).getConteudo();
    }

    // metodo uso interno
    private NoDuplo<T> getNo(int indice) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        // 2 condicoes de parada
        for (int i = 0; (i < indice) && (noAuxiliar != null); i++) {
            noAuxiliar = primeiroNo.getNoProximo();
        }
        return noAuxiliar;
    }

    // adiciona ao fim da lista
    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }

        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++; // a cada adicao, incrementa o tamanho da lista
    }

    // sobrecarga metodo add
    public void add(int indice, T elemento) {

        NoDuplo<T> noAuxiliar = getNo(indice);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.setNoPrevio(noAuxiliar);

        // insercao no meio da lista
        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); // seto no novo nó a referencia para o nó previo
            novoNo.getNoProximo().setNoPrevio(novoNo); // pego o proximo nó e seto o nó prévio como o novo nó
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        // inicio da lista
        if (indice == 0) {
            primeiroNo = novoNo;
        } else { // meio da lista
            novoNo.getNoPrevio().setNoPrevio(novoNo);
        }
        tamanhoLista++;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < size(); i++) {
            strRetorno += "[ No { conteudo = " + noAuxiliar.getConteudo() + " } ] ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
