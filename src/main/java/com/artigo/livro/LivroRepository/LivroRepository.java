package com.artigo.livro.LivroRepository;

import com.artigo.livro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
