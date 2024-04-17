package com;

import java.util.LinkedList;
import java.util.List;

public class CadastrarAluno {
    private String nome;
    private String idade;
    private String documento;
    private List<String> listaDeAlunos = new LinkedList<>();

    public String getNome() {
        return "Nome: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        listaDeAlunos.add("Nome: " + nome);
    }

    public String getIdade() {
        return "Idade: " + idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
        listaDeAlunos.add("Idade: " + idade);
    }

    public String getDocumento() {
        return "Documento: " + documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
        listaDeAlunos.add("Documento: " + documento);
    }

    public List<String> getListAlunos() {
        return listaDeAlunos;
    }

    public List<String> todosAlunos() {
        List<String> todos = new LinkedList<>();
        for (String aluno : listaDeAlunos) {
            todos.add(aluno);
        }
        return todos;
    }
}