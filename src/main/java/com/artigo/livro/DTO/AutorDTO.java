package com.artigo.livro.DTO;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AutorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int autorID;

    private String nome;

    private String nacionalidade;

    @OneToMany
    @JoinColumn(name = "livroID")
    private List<LivroDTO> livro;

    public List<LivroDTO> getLivro() {
        return livro;
    }

    public void setLivro(List<LivroDTO> livro) {
        this.livro = livro;
    }

    public int getAutorID() {
        return autorID;
    }

    public void setAutorID(int autorID) {
        this.autorID = autorID;
    }

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
