package com.artigo.livro.DTO;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class LivroDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long livroID;

    private String titulo;

    private String isbn;

    private int anoPublicacao;

   // @ManyToOne
  //  @JoinColumn(name = "autorID")
  //  private AutorDTO autor;

 //   public AutorDTO getAutor() {
 //       return autor;
//    }

  //  public void setAutor(AutorDTO autor) {
  //      this.autor = autor;
  //  }

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
}
