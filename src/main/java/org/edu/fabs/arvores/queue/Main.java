package org.edu.fabs.arvores.introducao.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // declarar queue do tipo carro
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros); // resultado: [Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}]

        // ADD = retorna true or false se conseguiu adicionar / se false ERRO
        // ADD = o ULTIMO adicionado esta no TOPO da pilha
        System.out.println(queueCarros.add(new Carro("Peugeot"))); // resultado: true
        System.out.println(queueCarros); // resultado: [Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Peugeot'}]

        // OFFER = retorna falso se nao conseguir executar, senao retorna a fila / se nao consegue adicionar NAO DA ERRO
        queueCarros.offer(new Carro("Renault")); // resultado: [Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Peugeot'}, Carro{marca='Renault'}]
        System.out.println(queueCarros);

        // PEEK
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        // POLL = pega o 1o carro da fila - e NAO REMOVE.
        // se o que esta na cabeca estiver vazio, retorna NULO
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        // IS EMPTY
        System.out.println(queueCarros.isEmpty());

        // SIZE
        System.out.println(queueCarros.size());
        System.out.println(queueCarros);
    }

}
