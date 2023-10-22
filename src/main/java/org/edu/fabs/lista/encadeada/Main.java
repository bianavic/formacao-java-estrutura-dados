package org.edu.fabs.lista.encadeada;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEnadeada = new ListaEncadeada<>();

        minhaListaEnadeada.add("teste1");
        minhaListaEnadeada.add("teste2");
        minhaListaEnadeada.add("teste3");
        minhaListaEnadeada.add("teste4");

        System.out.println(minhaListaEnadeada.get(0));
        System.out.println(minhaListaEnadeada.get(1));
        System.out.println(minhaListaEnadeada.get(2));
        System.out.println(minhaListaEnadeada.get(3));

        System.out.println(minhaListaEnadeada);

        System.out.println(minhaListaEnadeada.remove(2));

        System.out.println(minhaListaEnadeada);

    }

}
