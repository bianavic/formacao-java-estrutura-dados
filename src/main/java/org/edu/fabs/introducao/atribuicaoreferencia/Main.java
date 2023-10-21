package org.edu.fabs.introducao.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        System.out.println("### TIPO PRIMITIVO ###");
        System.out.println("----------------------");
        System.out.println("### OBJETO ###");
        // criar objeto A e objeto B
        Objeto objA = new Objeto(1);
        Objeto objB = objA;
        System.out.println("objA = " +objA+ " objB = " +objB);
        // resultado: objA = 1 objB = 1

        objA.setNum(2);
        System.out.println("objA = " +objA+ " objB = " +objB);
        // resultado: objA = 2 objB = 2
    }

}