package org.edu.fabs.atribuicaoreferencia;

public class TipoPrimitivo {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);
        // resposta: intA = 1 intB = 1

        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);
        // resposta: intA = 2 intB = 1

    }

}
