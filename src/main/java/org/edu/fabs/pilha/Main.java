package org.edu.fabs.pilha;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        // empilhar
//        minhaPilha.push(1); // ERRO: obs ela espera uma pilha q contenha um inteiro e nao numero 1
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        System.out.println(minhaPilha);

        // desempilhar
        // no resultado, tb é printado o objeto a ser retirado, no caso o valor 6
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        // empilhar
        minhaPilha.push(new No(99));
        System.out.println(minhaPilha);
    }

}
