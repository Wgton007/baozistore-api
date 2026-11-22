package br.com.wellington.baozistore.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Esta classe representa a tabela Cliente no banco de dados
@Entity
public class Cliente {

    // Chave primária da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome do cliente
    private String nome;

    // Data desde que o cliente é cliente da loja
    private LocalDate clienteDesde;
    
    // Construtor padrão
    public Cliente() {

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getClienteDesde() {
		return clienteDesde;
	}

	public void setClienteDesde(LocalDate clienteDesde) {
		this.clienteDesde = clienteDesde;
	}

}
