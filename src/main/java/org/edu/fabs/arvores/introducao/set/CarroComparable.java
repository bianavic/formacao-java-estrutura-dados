package org.edu.fabs.arvores.introducao.set;

import java.util.Objects;

public class CarroComparable implements Comparable<CarroComparable> {

    private String marca;

    public CarroComparable() {}

    public CarroComparable(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroComparable that = (CarroComparable) o;
        return Objects.equals(marca, that.marca);
    }

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

    // TAMANHO STRING
//    @Override
//    public int compareTo(CarroComparable carroComparable) {
//
//        // implementando pelo tamanho da String
//        // se o carro deve ficar na frente ou atras de outro pelo tamanho da string
//        if (this.marca.length() < carroComparable.marca.length()) {
//            return -1;
//        } else if (this.marca.length() > carroComparable.marca.length()) {
//            return 1;
//        }
//        return 0; // senao sao iguais
//    }

    // POR ORDEM ALFABETICA
    @Override
    public int compareTo(CarroComparable carroComparable) {
        return this.getMarca().compareTo(carroComparable.getMarca());
    }
}
