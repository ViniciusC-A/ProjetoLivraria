package com.artigo.livro.Controller;

import com.artigo.livro.DTO.LivroDTO;
import com.artigo.livro.LivroModel.LivroModel;
import com.artigo.livro.Service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LivroController {
    @Autowired
    private ILivroService livroService;

    protected ILivroService getLivroService() {
        return livroService;
    }

    @PostMapping("/livro")
    public LivroModel novoLivro(@RequestBody LivroModel livroModel){
        LivroModel livroNovo = getLivroService().criarLivro(livroModel);
        return livroNovo;


    }
}
