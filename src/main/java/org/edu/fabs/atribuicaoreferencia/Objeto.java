package org.edu.fabs.atribuicaoreferencia;

public class Objeto {

    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public Objeto(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

}
