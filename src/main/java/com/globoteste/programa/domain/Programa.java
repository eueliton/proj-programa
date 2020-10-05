package com.globoteste.programa.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "programa")
public class Programa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10)
	private String id;

	@Column(length = 100)
	private String nome;

	@CreationTimestamp
	@Column(name = "data_cadastro", nullable = false, updatable = false, insertable = false)
	private Timestamp data_cadastro;

	@Column(columnDefinition = "boolean default true")
	private boolean ativo;

	@Column(name = "data_exclusao", nullable = false, updatable = false, insertable = false)
	private Timestamp data_exclusao;

	public Programa() {
		super();
	}

	public Programa(String id, String nome, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Timestamp getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Timestamp data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Timestamp getData_exclusao() {
		return data_exclusao;
	}

	public void setData_exclusao(Timestamp data_exclusao) {
		this.data_exclusao = data_exclusao;
	}

}
