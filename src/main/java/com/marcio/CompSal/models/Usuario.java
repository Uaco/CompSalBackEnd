package com.marcio.CompSal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Usuario extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Column(nullable = false, length = 30)
	private String nomeUsuario;

	@Column(nullable = false, length = 30)
	private String senha;

	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;

	@OneToOne
	@JoinColumn(name = "matricula")
	private Pessoa pessoa;

	public Usuario() {}
	
	

	public Usuario(String nomeUsuario, String senha, TipoUsuario tipoUsuario, Pessoa pessoa) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
		this.pessoa = pessoa;
	}



	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	// public Pessoa getPessoa() {
	// return pessoa;
	// }
	//
	// public void setPessoa(Pessoa pessoa) {
	// this.pessoa = pessoa;
	// }

}
