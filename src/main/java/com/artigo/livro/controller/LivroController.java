package com.artigo.livro.controller;

import com.artigo.livro.dto.LivroDTO;
import com.artigo.livro.model.Livro;
import com.artigo.livro.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final ILivroService livroService;

    @Autowired
    public LivroController(ILivroService livroService) {
        this.livroService = livroService;
    }

    // POST - Criar novo livro
    @PostMapping
    public LivroDTO novoLivro(@RequestBody LivroDTO livroDTO) {
        Livro livro = new Livro();
        livro.setTitulo(livroDTO.getTitulo());
        livro.setIsbn(livroDTO.getIsbn());
        livro.setAnoPublicacao(livroDTO.getAnoPublicacao());

        Livro livroSalvo = livroService.criarLivro(livro);

        LivroDTO response = new LivroDTO();
        response.setTitulo(livroSalvo.getTitulo());
        response.setIsbn(livroSalvo.getIsbn());
        response.setAnoPublicacao(livroSalvo.getAnoPublicacao());

        return response;
    }

    // GET - Buscar livro por ID
    @GetMapping("/{id}")
    public LivroDTO buscarPorId(@PathVariable Long id) {
        Optional<Livro> livroOpt = livroService.buscarPorId(id);

        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();
            LivroDTO dto = new LivroDTO();
            dto.setTitulo(livro.getTitulo());
            dto.setIsbn(livro.getIsbn());
            dto.setAnoPublicacao(livro.getAnoPublicacao());
            return dto;
        } else {
            throw new RuntimeException("Livro não encontrado com ID: " + id);
        }
    }

    // GET - Listar todos os livros
    @GetMapping
    public List<LivroDTO> listarTodos() {
        List<Livro> livros = livroService.listarTodos();
        return livros.stream().map(livro -> {
            LivroDTO dto = new LivroDTO();
            dto.setTitulo(livro.getTitulo());
            dto.setIsbn(livro.getIsbn());
            dto.setAnoPublicacao(livro.getAnoPublicacao());
            return dto;
        }).collect(Collectors.toList());
    }

    // PUT - Atualizar livro por ID
    @PutMapping("/{id}")
    public LivroDTO atualizarLivro(@PathVariable Long id, @RequestBody LivroDTO livroDTO) {
        Optional<Livro> livroOpt = livroService.buscarPorId(id);

        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();
            livro.setTitulo(livroDTO.getTitulo());
            livro.setIsbn(livroDTO.getIsbn());
            livro.setAnoPublicacao(livroDTO.getAnoPublicacao());

            Livro atualizado = livroService.criarLivro(livro);

            LivroDTO response = new LivroDTO();
            response.setTitulo(atualizado.getTitulo());
            response.setIsbn(atualizado.getIsbn());
            response.setAnoPublicacao(atualizado.getAnoPublicacao());

            return response;
        } else {
            throw new RuntimeException("Livro não encontrado para atualizar com ID: " + id);
        }
    }

    // DELETE - Excluir livro por ID
    @DeleteMapping("/{id}")
    public String excluirLivro(@PathVariable Long id) {
        Optional<Livro> livroOpt = livroService.buscarPorId(id);

        if (livroOpt.isPresent()) {
            livroService.excluirPorId(id);
            return "Livro excluído com sucesso!";
        } else {
            throw new RuntimeException("Livro não encontrado para exclusão com ID: " + id);
        }
    }
}
