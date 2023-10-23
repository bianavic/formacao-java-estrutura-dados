package org.edu.fabs.arvores.implementacao.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> carroList = new ArrayList<>();

        // ADD
        carroList.add(new Carro("Ford"));
        carroList.add(new Carro("Chevrolet"));
        carroList.add(new Carro("Fiat"));
        carroList.add(new Carro("Peugeot"));

        // CONTAINS
        System.out.println(carroList.contains(new Carro("Chevrolet")));

        // GET
        System.out.println(carroList.get(2));

        // INDEXOF
        System.out.println(carroList.indexOf(new Carro("Fiat")));

        System.out.println(carroList);

        // REMOVE
//        System.out.println(carroList.remove(new Carro("Fiat")));
        System.out.println(carroList.remove(2));
        System.out.println(carroList);

    }

}
