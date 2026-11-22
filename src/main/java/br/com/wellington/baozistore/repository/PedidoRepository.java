package br.com.wellington.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellington.baozistore.model.Pedido;

// Interface responsável pelo acesso aos dados da tabela Pedido
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}