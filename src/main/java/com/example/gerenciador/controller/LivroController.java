package com.example.gerenciador.controller;

import com.example.gerenciador.model.Livro;
import com.example.gerenciador.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    // Listar todos os livros
    @GetMapping
    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    // Buscar livro por ID
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarLivro(@PathVariable Long id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    // Adicionar novo livro
    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }
    

    // Atualizar livro existente
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        Optional<Livro> optionalLivro = livroRepository.findById(id);
        if (optionalLivro.isPresent()) {
            Livro livro = optionalLivro.get();
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
            return ResponseEntity.ok(livroRepository.save(livro));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Deletar livro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        if (livroRepository.existsById(id)) {
            livroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
