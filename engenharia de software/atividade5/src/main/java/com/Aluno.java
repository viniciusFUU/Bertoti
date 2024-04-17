package com;

import java.util.LinkedList;
import java.util.List;

public class Aluno {
    private String nome;
    private String idade;
    private String documento;
    private List<String> listaDeAlunos = new LinkedList<>();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
        listaDeAlunos.add(nome);
    }

    public String getIdade(){
        return idade;
    }

    public void setIdade(String idade){
        this.idade = idade;
        listaDeAlunos.add(idade);
    }

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
        listaDeAlunos.add(documento);
    }

    public List<String> getListNome(){
        return listaDeAlunos;
    }
}
