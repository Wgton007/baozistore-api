package br.com.wellington.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellington.baozistore.model.Produto;

// Interface responsável pelo acesso aos dados da tabela Produto
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}