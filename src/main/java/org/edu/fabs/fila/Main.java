package org.edu.fabs.fila;

public class Main {

    public static void main(String[] args) {

        Fila minhaFila = new Fila();
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);
        // resultado: [ No { objeto = quarto} ][ No { objeto = terceiro} ][ No { objeto = segundo} ][ No { objeto = primeiro} ]null

        // desenfileirar
        System.out.println(minhaFila.dequeue()); // resultado: No{object=primeiro}
        System.out.println(minhaFila);
        // resultado: [ Nó { objeto = quarto} ] [ Nó { objeto = terceiro} ] [ Nó { objeto = segundo} ] null

        // enfileirar / adicionar novo
        minhaFila.enqueue(new No("ultimo"));
        System.out.println(minhaFila);
        // resultado: [ Nó { objeto = ultimo} ] [ Nó { objeto = quarto} ] [ Nó { objeto = terceiro} ] [ Nó { objeto = segundo} ] null

        // first = espero pegar o segundo nó, que no caso é o primeiro da fila
        System.out.println(minhaFila.first()); // estou pegando null ao inves de { objeto = segundo}
        System.out.println(minhaFila); // ele precisa continuar na fila
    }

}
