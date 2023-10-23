package org.edu.fabs.arvores.implementacao.stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // declarar uma pilha de carros
        Stack<Carro> stackCarros = new Stack<>();

        // PUSH = o ULTIMO adicionado esta no TOPO da pilha
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        // resultado [Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Volkswagen'}]
        System.out.println(stackCarros);

        // POP = RETIRA quem esta no topo
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        // PEEK = pega o objeto, imprime, mas NAO RETIRA
        System.out.println(stackCarros.peek()); // resultado: Carro{marca='Chevrolet'}
        System.out.println(stackCarros); // resultado: [Carro{marca='Ford'}, Carro{marca='Chevrolet'}]

        // EMPTY
        System.out.println(stackCarros.empty());
        System.out.println(stackCarros);
    }

}
