package com.artigo.livro.Service;

import com.artigo.livro.LivroBO.LivroBO;
import com.artigo.livro.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService implements ILivroService {
    private LivroBO livroBO;

    @Autowired
    public LivroService(LivroBO livroBO) {
        this.livroBO = livroBO;
    }

    @Override
    public Livro criarLivro(Livro livroModel) {
        return livroBO.criarLivro(livroModel);
    }
}
