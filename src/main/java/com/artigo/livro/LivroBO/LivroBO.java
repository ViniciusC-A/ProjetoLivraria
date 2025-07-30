package com.artigo.livro.LivroBO;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroRepository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class LivroBO {
    @Autowired
    private LivroRepository livroRepository;

    public LivroDTO criarLivro(LivroDTO livroDTO){
        return livroRepository.save(livroDTO);
    }
    public Optional<LivroDTO> buscarPorId(Long id) {
        return livroRepository.findById(id);
    }

}
