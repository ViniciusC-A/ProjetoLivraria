package com.artigo.livro.Service;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroBO.LivroBO;
import com.artigo.livro.LivroModel.LivroModel;
import org.springframework.stereotype.Service;

@Service
public class LivroService implements ILivroService {
    public LivroModel criarLivro(LivroModel livroModel){
        return new LivroBO().criarLivro(livroModel);
    }
}
