package org.edu.fabs.introducao.noeencadeamento;

public class Main {

    public static void main(String[] args) {

        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");

        // referencia do no1 aponta para o no2
        no1.setProximoNo(no2);

        // referencia do no3 aponta para o n2
        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        // referencia do no3 apontada para no4
        No no4 = new No("Conteudo no4");
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
