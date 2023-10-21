package org.edu.fabs.pilha;

public class Pilha {

    No refNoEntradaPilha = null;

    // função para INSERIR um elemento no final de alguma estrutura
    // 1 - qdo entra o novo nó, sua referencia ainda está setada como nula
    // 2 - é colocado no topo da pilha, assim recebe a referencia do topo
    void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    // ato de DESEMPILHAR a pilha
    // retira o primeiro nó, aquele do topo, a referencia de topo passa para o no seguinte, o que esta logo abaixo
    public No pop() {
        if (!isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    // recebe a REFERENCIA do primeiro no e utiliza suas infos SEM retirar o nó da pilha
    public No top() {
        return refNoEntradaPilha;
    }


    // verifica se existe uma pilha
    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "--------------\n";

        // no utilizado para percorrer a pilha e dar um print de cada pilha
        No noauxiliar = refNoEntradaPilha; // capturar a referencia de entrada da pilha

        // saberei q cheguei à base da pilha qdo for nulo, pois a base dessa pilha tem como referencia null
        while (true) {
            if (noauxiliar != null) {
                stringRetorno += "[ Nó { dado = " + noauxiliar.getDado() + " } ]\n";
                // navegar para o proximo nó | refNo é o nó logo abaixo
                noauxiliar = noauxiliar.getRefNo();  // o elemento do topo passara a ser o nó apos o topo dessa pilha
            } else {
                break; // se estivermos com lista vazia, break no loop
            }
        }
        stringRetorno += "==============\n";
        return stringRetorno;
    }

}
