package com;

import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        CadastrarAluno aluno1 = new CadastrarAluno();
        CadastrarAluno aluno2 = new CadastrarAluno();

        aluno1.setNome("vinicius");
        aluno1.setIdade("25");
        aluno1.setDocumento("12321");

        aluno2.setNome("bianca");
        aluno2.setIdade("22");
        aluno2.setDocumento("13231");

        // Adiciona alunos à listaDeAlunos
        List<String> todosAlunos = aluno1.todosAlunos();
        todosAlunos.addAll(aluno2.todosAlunos());

        // Imprime todos os alunos
        System.out.println("Todos os alunos:");
        for (String aluno : todosAlunos) {
            System.out.println(aluno);
        }
    }
}