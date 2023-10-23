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

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem ");
        exibirInOrdem(this.raiz); // metodo recursivo
    }
    private void exibirInOrdem(BinNo<T> atual) { // metodo privado para exibicao recursiva
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq()); // visita
            System.out.println(atual.getConteudo() + ", "); // exibe
            exibirInOrdem(atual.getNoDir()); // visita
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PósOrdem ");
        exibirInOrdem(this.raiz); // metodo recursivo
    }
    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq()); // visita
            exibirPosOrdem(atual.getNoDir()); // visita
            System.out.println(atual.getConteudo() + ", "); // exibe
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem ");
        exibirInOrdem(this.raiz); // metodo recursivo
    }
    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + ", "); // exibe
            exibirPreOrdem(atual.getNoEsq()); // visita
            exibirPreOrdem(atual.getNoDir()); // visita
        }
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho  = null;
            BinNo<T> temp = null;

            // procurar o nó a ser excluido: buscar o primeiro nó com o conteudo passado
            while (atual != null && !atual.getConteudo().equals(conteudo)) {

                // loop
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            // se nao encontrar ninguem? ou cheguei numa folha ou a raiz é nula
            if (atual == null) {
                System.out.println("conteudo nao encontrado - bloco try");
            }

            // se pai == null
            if (pai == null) {

                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null; // condicao de parada;
                         temp = filho, filho = filho.getNoEsq()
                    ) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

                // percorrer a arvore
            } else if (atual.getNoDir() == null) { // se atual dir == null
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) { // se atual esq == null
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {

                for (temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho.getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }

            }

        } catch (NullPointerException erro) {
            System.out.println("conteudo nao encontrado - bloco catch");
        }

    }

}