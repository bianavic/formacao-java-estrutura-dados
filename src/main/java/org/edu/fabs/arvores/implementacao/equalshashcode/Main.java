package org.edu.fabs.arvores.implementacao.equalshashcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var listaCarro = new ArrayList<Carro>();
        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Chevrolet"));
        listaCarro.add(new Carro("Volkswagen"));

        System.out.println(listaCarro.contains(new Carro("Ford")));

        // comparacao o nome da marca, nao compara a posicao de memoria do obj
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        Carro carro3 = new Carro("Ford");

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));

    }

}
