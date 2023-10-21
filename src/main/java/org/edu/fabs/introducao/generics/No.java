package org.edu.fabs.introducao.generics;

public class No {

    // aceita apenas String
    private String conteudo;
    private org.edu.fabs.introducao.noeencadeamento.No proximoNo;

    public No(String conteudo) {
        // garantir q a referencia do proximo nó seja nulo
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public org.edu.fabs.introducao.noeencadeamento.No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(org.edu.fabs.introducao.noeencadeamento.No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

}
