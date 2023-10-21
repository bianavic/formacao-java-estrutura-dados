package org.edu.fabs.fila.refatoracao;


public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);
        // resultado: [ No { objeto = quarto} ][ No { objeto = terceiro} ][ No { objeto = segundo} ][ No { objeto = primeiro} ]null

        // desenfileirar
        System.out.println(minhaFila.dequeue()); // resultado: No{object=primeiro}
        System.out.println(minhaFila);
        // resultado: [ Nó { objeto = quarto} ] [ Nó { objeto = terceiro} ] [ Nó { objeto = segundo} ] null

        // enfileirar / adicionar novo
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
        // resultado: [ Nó { objeto = ultimo} ] [ Nó { objeto = quarto} ] [ Nó { objeto = terceiro} ] [ Nó { objeto = segundo} ] null

        // first = espero pegar o segundo nó, que no caso é o primeiro da fila
        System.out.println(minhaFila.first()); // estou pegando null ao inves de { objeto = segundo}
        System.out.println(minhaFila); // ele precisa continuar na fila
    }

}
