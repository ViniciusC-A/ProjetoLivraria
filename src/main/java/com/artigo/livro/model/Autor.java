package com.artigo.livro.model;

import javax.persistence.*;
import java.util.List;

@Table (name = "autor")
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int autorID;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @OneToMany
    @JoinColumn(name = "livroID")
    private List<Livro> livro;

    public List<Livro> getLivro() {
        return livro;
    }

    public void setLivro(List<Livro> livro) {
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
