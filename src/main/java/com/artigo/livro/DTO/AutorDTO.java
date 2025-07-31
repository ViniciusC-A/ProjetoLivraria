package com.artigo.livro.DTO;

import javax.persistence.*;


import java.util.List;


public class AutorDTO {

    private String nome;

    private String nacionalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
