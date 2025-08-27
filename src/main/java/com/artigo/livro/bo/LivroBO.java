package com.artigo.livro.bo;

import com.artigo.livro.model.Livro;
import com.artigo.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroBO {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroBO(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro criarLivro(Livro livroModel) {
        return livroRepository.save(livroModel);
    }

    public Optional<Livro> buscarPorId(Long id) {
        return livroRepository.findById(id);
    }

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    public void excluirPorId(Long id) {
        livroRepository.deleteById(id);
    }
}
