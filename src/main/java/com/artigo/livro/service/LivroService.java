package com.artigo.livro.service;

import com.artigo.livro.bo.LivroBO;
import com.artigo.livro.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService implements ILivroService {

    private final LivroBO livroBO;

    @Autowired
    public LivroService(LivroBO livroBO) {
        this.livroBO = livroBO;
    }

    @Override
    public Livro criarLivro(Livro livroModel) {
        return livroBO.criarLivro(livroModel);
    }

    @Override
    public Optional<Livro> buscarPorId(Long id) {
        return livroBO.buscarPorId(id);
    }

    @Override
    public List<Livro> listarTodos() {
        return livroBO.listarTodos();
    }

    @Override
    public void excluirPorId(Long id) {
        livroBO.excluirPorId(id);
    }
}
