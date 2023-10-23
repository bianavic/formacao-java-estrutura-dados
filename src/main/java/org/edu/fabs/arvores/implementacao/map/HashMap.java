package org.edu.fabs.arvores.implementacao.map;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<String, String> aluno = new java.util.HashMap<>();

        // criar aluno
        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        // retorna grupo de aluno
        System.out.println(aluno);

        // KEYSET
        // retorna o GRUPO das chaves
        // resultado: [Turma, Idade, Media, Nome]
        System.out.println(aluno.keySet());

        // VALUES
        // colection dos valores correspondentes a cada chave
        // resultado: [3a, 17, 8.5, Joao]
        System.out.println(aluno.values());
    }

}
