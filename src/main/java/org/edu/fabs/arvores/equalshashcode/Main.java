package org.edu.fabs.arvores.introducao.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarro = new ArrayList<>();
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
