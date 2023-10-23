package org.edu.fabs.arvores.introducao.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        // HashSet nao preserva a ordem
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alpha Romeo"));

        System.out.println(hashSetCarros);

        // ARVORES
        // sem comparable: ClassCastException: Carro cannot be cast to class java.lang.Comparable
//        Set<Carro> treeSetCarros = new TreeSet<>();
//        treeSetCarros.add(new Carro("Ford"));
//        treeSetCarros.add(new Carro("Chevrolet"));
//        treeSetCarros.add(new Carro("Fiat"));
//        treeSetCarros.add(new Carro("Peugeot"));
//        treeSetCarros.add(new Carro("Zip"));
//        treeSetCarros.add(new Carro("Alpha Romeo"));
//
//        System.out.println(treeSetCarros);

        // COMPARABLE -> organizados pelo tamanho da string
        // resultado: [Carro{marca='Zip'}, Carro{marca='Ford'}, Carro{marca='Peugeot'}, Carro{marca='Chevrolet'}, Carro{marca='Alpha Romeo'}]

        // COMPARABLE -> organizado por ordem alfabetica
        // resultado: [Carro{marca='Alpha Romeo'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Ford'}, Carro{marca='Peugeot'}, Carro{marca='Zip'}]


        Set<CarroComparable> treeSetCarros2 = new TreeSet<>();
        treeSetCarros2.add(new CarroComparable("Ford"));
        treeSetCarros2.add(new CarroComparable("Chevrolet"));
        treeSetCarros2.add(new CarroComparable("Fiat"));
        treeSetCarros2.add(new CarroComparable("Peugeot"));
        treeSetCarros2.add(new CarroComparable("Zip"));
        treeSetCarros2.add(new CarroComparable("Alpha Romeo"));


        System.out.println(treeSetCarros2);

    }

}
