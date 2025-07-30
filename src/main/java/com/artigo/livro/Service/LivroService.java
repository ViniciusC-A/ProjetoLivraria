package com.artigo.livro.Service;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroBO.LivroBO;
import org.springframework.stereotype.Service;

@Service
public class LivroService implements ILivroService {
    public LivroDTO criarLivro(LivroDTO livro){
        return new LivroBO().criarLivro(livro);
    }
}
