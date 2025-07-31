package com.artigo.livro.LivroBO;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroModel.LivroModel;
import com.artigo.livro.LivroRepository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroBO {
    @Autowired
    private LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }
    public Optional<LivroModel> buscarPorId(Long id) {
        return livroRepository.findById(id);
    }

}
