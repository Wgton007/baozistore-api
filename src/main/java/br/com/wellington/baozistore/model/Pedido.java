package br.com.wellington.baozistore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Esta classe representa a tabela Pedido no banco de dados
@Entity
public class Pedido {

    // Chave primária da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ID do cliente que fez o pedido
    private Long clienteId;

    // ID do produto comprado
    private Long produtoId;

    // Quantidade do produto comprada
    private Integer quantidade;

    // Construtor padrão
    public Pedido() {

    }
    
 // Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}