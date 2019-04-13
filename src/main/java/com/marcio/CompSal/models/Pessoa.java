package com.marcio.CompSal.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "matricula", nullable = false)
	private Integer matricula;

	@Column(nullable = false, length = 80, unique = true)
	private String nome;

	@Column(nullable = false, length = 12, unique = true)
	private String rg;

	@Column(nullable = false, length = 14, unique = true)
	private String cpf;

	@Column(nullable = false, length = 3)
	private String idade;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dataNasc;

	@Column(nullable = false, length = 14)
	private String telefone;

	@Column(nullable = false, length = 30)
	private String cadastradoPor;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;


	@OneToOne(mappedBy = "pessoa")
	@Cascade(CascadeType.ALL)
	private Usuario usuario;


	@OneToOne(mappedBy = "pessoa")
	@Cascade(CascadeType.ALL)
	private Endereco endereco;


	public Pessoa() {};
	
	

	public Pessoa(Integer matricula, String nome, String rg, String cpf, String idade, Date dataNasc, String telefone,
			String cadastradoPor, Date dataCadastro, Usuario usuario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.cadastradoPor = cadastradoPor;
		this.dataCadastro = dataCadastro;
		this.usuario = usuario;
		
	}

	public Pessoa(Integer matricula, String nome, String rg, String cpf, String idade, Date dataNasc, String telefone,
			String cadastradoPor, Date dataCadastro, Endereco endereco) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.cadastradoPor = cadastradoPor;
		this.dataCadastro = dataCadastro;
		this.endereco = endereco;
		
	}


	public Integer getMatricula() {
		return matricula;	
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCadastradoPor() {
		return cadastradoPor;
	}

	public void setCadastradoPor(String cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
