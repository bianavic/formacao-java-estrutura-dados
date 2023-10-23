package org.edu.fabs.arvores.binaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    //setar raiz como null para q em toda instanciacao da ArvoreBinaria a raiz seja nula
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {

        if (atual == null) { // significa q esta vazia, pego valor do atual e seto como a raiz
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo)); // RECURSIVIDADE - inserir()
        } else {
            atual.setNoEsq(inserir(atual.getNoDir(), novoNo)); // RECURSIVIDADE
        }
        return atual;
    }

}