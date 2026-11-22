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

import br.com.wellington.baozistore.model.Pedido;
import br.com.wellington.baozistore.repository.PedidoRepository;

// Controller responsável pelos endpoints de Pedido
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Lista todos os pedidos cadastrados
    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    // Cadastra um novo pedido
    @PostMapping
    public Pedido cadastrarPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Busca um pedido pelo ID
    @GetMapping("/{id}")
    public Optional<Pedido> buscarPorId(@PathVariable Long id) {
        return pedidoRepository.findById(id);
    }

    // Remove um pedido pelo ID
    @DeleteMapping("/{id}")
    public void excluirPedido(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
}