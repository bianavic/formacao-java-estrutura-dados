package org.edu.fabs.arvores.equalshashcode;

import org.edu.fabs.arvores.introducao.equalshashcode.Carro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var listaCarro = new ArrayList<org.edu.fabs.arvores.introducao.equalshashcode.Carro>();
        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Chevrolet"));
        listaCarro.add(new Carro("Volkswagen"));

        System.out.println(listaCarro.contains(new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Ford")));

        // comparacao o nome da marca, nao compara a posicao de memoria do obj
        System.out.println(new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Ford").hashCode());
        System.out.println(new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Ford").hashCode());
        System.out.println(new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Ford1").hashCode());

        org.edu.fabs.arvores.introducao.equalshashcode.Carro carro1 = new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Ford");
        org.edu.fabs.arvores.introducao.equalshashcode.Carro carro2 = new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Chevrolet");
        org.edu.fabs.arvores.introducao.equalshashcode.Carro carro3 = new org.edu.fabs.arvores.introducao.equalshashcode.Carro("Ford");

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));

    }

}
