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
        return tamanhoLista;
    }

    // metodo uso interno
    private NoDuplo<T> getNo(int indice) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        // 2 condicoes de parada
        for (int i = 0; (i < indice) && (noAuxiliar != null) ; i++) {
            noAuxiliar = primeiroNo.getNoProximo();
        }
        return noAuxiliar;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i < size(); i++){
            strRetorno += "[ No { conteudo = " + noAuxiliar.getConteudo() +" } ] ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
