package com.artigo.livro.LivroModel;

import com.artigo.livro.AutorModel.AutorModel;
import com.artigo.livro.DTO.AutorDTO;

import javax.persistence.*;

@Entity
@Table(name = "livro")
public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long livroID;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "isbn")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorModel autor;

    public Long getLivroID() {
        return livroID;
    }

    public void setLivroID(Long livroID) {
        this.livroID = livroID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    private int anoPublicacao;
}

//CREATE DATABASE livrodb;
//
//USE livrodb;
//
//CREATE TABLE autor (
//    id INT AUTO_INCREMENT PRIMARY KEY,
//    nome VARCHAR(100) NOT NULL,
//    nacionalidade varchar(10) NOT NULL
//
//
//
//);
//
//CREATE TABLE livro (
//    id INT AUTO_INCREMENT PRIMARY KEY,
//    titulo VARCHAR(100) NOT NULL,
//    isbn varchar(10) NOT NULL,
//    autor_id INT NOT NULL,
//    FOREIGN KEY (autor_id) REFERENCES autor(id)
//);