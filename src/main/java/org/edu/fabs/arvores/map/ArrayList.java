package org.edu.fabs.arvores.map;

import java.util.List;
import java.util.Map;

public class ArrayList {

    public static void main(String[] args) {

        Map<String, String> aluno = new java.util.HashMap<>();
        Map<String, String> aluno2 = new java.util.HashMap<>();

        // criar aluno
        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        // LISTA DE MAPS, LISTA DE ALUNOS
        List<Map<String, String>> listaAlunos = new java.util.ArrayList<>();
        listaAlunos.add(aluno);

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
    }

}
