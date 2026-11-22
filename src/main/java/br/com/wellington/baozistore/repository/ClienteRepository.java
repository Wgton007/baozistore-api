package br.com.wellington.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellington.baozistore.model.Cliente;

// Interface responsável pelo acesso aos dados da tabela Cliente
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}