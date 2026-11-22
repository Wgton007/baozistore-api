package br.com.wellington.baozistore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wellington.baozistore.model.Produto;
import br.com.wellington.baozistore.repository.ProdutoRepository;

// Controller responsável pelos endpoints de Produto
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Lista todos os produtos cadastrados
    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Cadastra um novo produto
    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // Busca um produto pelo ID
    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    // Remove um produto pelo ID
    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}