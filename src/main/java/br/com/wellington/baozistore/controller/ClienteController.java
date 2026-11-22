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

import br.com.wellington.baozistore.model.Cliente;
import br.com.wellington.baozistore.repository.ClienteRepository;

// Controller responsável pelos endpoints de Cliente
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Lista todos os clientes cadastrados
    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    // Cadastra um novo cliente
    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Busca um cliente pelo ID
    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id);
    }

    // Remove um cliente pelo ID
    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}