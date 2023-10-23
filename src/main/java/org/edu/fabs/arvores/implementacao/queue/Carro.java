package org.edu.fabs.arvores.implementacao.queue;

import java.util.Objects;

public class Carro {

    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // testar se este objeto que istanciei é igual ao objeto q estou passando
    @Override
    public boolean equals(Object o) {
        // se a referencia de memoria é igual
        if (this == o) return true;
        // se o objeto é nulo OU se a objetos estiveram em classes diferentes
        if (o == null || getClass() != o.getClass()) return false;
        // cria 1 obj carro temporario, faz cast do objeto q passei como parametro
        Carro carro = (Carro) o;
        // retorna se obj é igual ao outro - atributo marca é o que esta sendo levado em consideracao
        return Objects.equals(marca, carro.marca);

//        return true; // OBS: qquer obj carro comparado com qquer obj carro sera IGUAL

    }

    // metodo da classe Object
    // retorna um inteiro, um hash, gerado a partir do atributo marca
    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

}
