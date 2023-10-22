package org.edu.fabs.lista.circular;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0"); // cabeca e cauda
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0); // vazio
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1"); // cabeca e cauda
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2"); // cauda
        minhaListaCircular.add("c3"); // cauda
        System.out.println(minhaListaCircular);

        // MODO 1
//        System.out.println(minhaListaCircular.get(0)); // cauda
//        System.out.println(minhaListaCircular.get(1)); // meio
//        System.out.println(minhaListaCircular.get(2)); // cabeca
//
//        System.out.println(minhaListaCircular.get(3)); // LOOP, ele retorna para indice 0
//        System.out.println(minhaListaCircular.get(4)); // LOOP continua

        // MODO 2
        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }

    }

}
