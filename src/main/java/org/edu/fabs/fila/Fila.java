package org.edu.fabs.fila;

public class Fila {

    // obs: aqui entrar pelo fim dela
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // metodo enfileirar
    public void enqueue(No novoNo) {
        // setar a referencia do novo no com a entrada da fila
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
        // referencia de entrada passara a ser o novoNo
    }

    // fisrt o primeiro q chegou na fila
    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila; // se existe apenas 1 pessoa na fila, ela é a primeira e ultima
            // loop ate chegar no primeiro da fila
            while (true) {
                // se nao for o primeiro, se for diferente de nulo, sei q tem outro
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo(); // passa a ser o nó da frente, o getRefNo(), que é o proximo no da fila
                    // senao
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    // desenfileirar
    // alem de pegar o ṕrimeiro da fila guardando a informacao, ele retira o primeiro da fila.
    // pega o imediatamente anterior e aponta a referencia dele para nulo
    // semelhante ao metodo first(), porem aqui é necessario guardar a info do nó
    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila; // manter ele em i - 1
            // loop ate chegar no primeiro da fila
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    // antes do primeiro nó passar a ser o proximo, antes de percorrer, vamos guardar no noAuxiliar
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo(); // passa a ser o nó da frente, o getRefNo(), que é o proximo no da fila
                } else {
                    // sobre o no auxiliar: qdo chegar no primeiro nó, eu tenho o meu no imediatamente anterior
                    // seto a referencia de nó dele para nulo, tornando-o o primeiro no da fila
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[ Nó { objeto = " + noAuxiliar.getObject() + "} ] "; // imprimir fila do final para o inicio

                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo(); // no auxiliar se torna o imediatamete apos ele
                } else {
                    stringRetorno += null; // primeiro no da fila aponta para nulo
                    break;
                }
            }
        } else {
            stringRetorno = " null";
        }
        return stringRetorno;
    }

}
