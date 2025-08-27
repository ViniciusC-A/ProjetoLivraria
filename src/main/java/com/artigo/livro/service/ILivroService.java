package com.artigo.livro.service;

import com.artigo.livro.model.Livro;

import java.util.List;
import java.util.Optional;

public interface ILivroService {
    Livro criarLivro(Livro livroModel);
    Optional<Livro> buscarPorId(Long id);
    List<Livro> listarTodos();
    void excluirPorId(Long id);
}
