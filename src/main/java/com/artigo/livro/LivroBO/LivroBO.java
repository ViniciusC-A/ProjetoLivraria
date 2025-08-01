package com.artigo.livro.LivroBO;

import com.artigo.livro.model.Livro;
import com.artigo.livro.LivroRepository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroBO {
    @Autowired
    private LivroRepository livroRepository;

    public Livro criarLivro(Livro livroModel){
        System.out.println("livroRepository: " + livroRepository);
        System.out.println("livroModel: " + livroModel);
        return livroRepository.save(livroModel);
    }
    public Optional<Livro> buscarPorId(Long id) {
        return livroRepository.findById(id);
    }


}
