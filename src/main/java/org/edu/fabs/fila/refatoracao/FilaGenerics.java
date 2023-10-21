package org.edu.fabs.fila.refatoracao;

import org.edu.fabs.fila.No;

public class FilaGenerics {

    /**
     * como esta:
     *         Fila minhaFila = new Fila();
     *         minhaFila.enqueue("primeiro");
     *         minhaFila.enqueue(1);
     * refatoracao:
     *
     *          Fila<String> minhaFila = new Fila<String>();
     *          minhaFila.enqueue("primeiro");
     *          minhaFila.enqueue(1); // ERRO
     */

    private No refNoEntradaFila;

    public FilaGenerics() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }


    // encapsulamento
    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // ao inves de retornar o primeiro nó,
    public Object first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getObject() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public Object dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
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
