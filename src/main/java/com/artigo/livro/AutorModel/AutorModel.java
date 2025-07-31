package com.artigo.livro.AutorModel;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroModel.LivroModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class AutorModel {

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
    private List<LivroModel> livro;

    public List<LivroModel> getLivro() {
        return livro;
    }

    public void setLivro(List<LivroModel> livro) {
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
