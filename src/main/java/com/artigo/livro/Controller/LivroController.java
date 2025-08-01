package com.artigo.livro.Controller;

import com.artigo.livro.model.Livro;
import com.artigo.livro.Service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private ILivroService livroService;

    protected ILivroService getLivroService() {
        return livroService;
    }

    @PostMapping
    public Livro novoLivro(@RequestBody Livro livro){
        Livro livroNovo = getLivroService().criarLivro(livro);
        return livroNovo;


    }
}
