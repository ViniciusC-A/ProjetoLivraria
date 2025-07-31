package com.artigo.livro.LivroRepository;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroModel.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {

}
