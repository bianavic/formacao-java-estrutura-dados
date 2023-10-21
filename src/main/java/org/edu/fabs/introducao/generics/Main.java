package org.edu.fabs.generics;


public class Main {

    public static void main(String[] args) {

        // amarramos os nós ao String

        NoRefatoradoComGenerics<String> no1 = new NoRefatoradoComGenerics<>("Conteudo no1");
        NoRefatoradoComGenerics<String> no2 = new NoRefatoradoComGenerics<>("Conteudo no2");

        // referencia do no1 aponta para o no2
        no1.setProximoNo(no2);

        // referencia do no3 aponta para o n2
        NoRefatoradoComGenerics<String> no3 = new NoRefatoradoComGenerics<>("Conteudo no3");
        no2.setProximoNo(no3);

        // referencia do no3 apontada para no4
        NoRefatoradoComGenerics<String> no4 = new NoRefatoradoComGenerics<>("Conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        // resposta: No{conteudo='Conteudo no1'}

        System.out.println(no1.getProximoNo());
        // abaixo, com o proprio no1 eu consigo printar o no2
        //resposta: No{conteudo='Conteudo no2'}

        System.out.println("---------------");

        // no1 -> no2 -> no3 -> no4 -> null
        System.out.println(no1); // no1
        System.out.println(no1.getProximoNo()); // apontar no1 para o proximo no2
        System.out.println(no1.getProximoNo().getProximoNo()); // apontar para no3
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // apontar para no4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // ultimo nó == null

        /**
         * resultado:
         * No{conteudo='Conteudo no1'}
         * No{conteudo='Conteudo no2'}
         * No{conteudo='Conteudo no3'}
         * No{conteudo='Conteudo no4'}
         * null
         */
    }

}
