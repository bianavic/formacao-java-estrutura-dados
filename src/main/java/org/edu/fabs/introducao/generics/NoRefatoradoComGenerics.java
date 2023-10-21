package org.edu.fabs.generics;

public class NoRefatoradoComGenerics<T> {

    // tipo gererico T, aceitara conteudo de qquer tipo

    private T conteudo;
    private NoRefatoradoComGenerics<T> proximoNo; // referncia do Objeto no sera do mesmo T generico

    public NoRefatoradoComGenerics(T conteudo) {
        // garantir q a referencia do proximo nó seja nulo
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefatoradoComGenerics<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoRefatoradoComGenerics<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

}
