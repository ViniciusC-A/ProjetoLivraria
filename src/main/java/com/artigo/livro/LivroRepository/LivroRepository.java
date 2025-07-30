package com.artigo.livro.LivroRepository;

import com.artigo.livro.DTO.LivroDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroDTO, Long> {

}
