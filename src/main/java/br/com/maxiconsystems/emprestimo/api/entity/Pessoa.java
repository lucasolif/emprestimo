package br.com.maxiconsystems.emprestimo.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpfCnpj;
	private String genero;
	private String email;
	private String contato;
	private boolean status;
	private LocalDate dataNascimento;
	private BigDecimal rendaMensal;
	
	@Embedded 
	private Endereco endereco;
	
	
	public Pessoa() {
	
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getContato() {
		return contato;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public BigDecimal getRendaMensal() {
		return rendaMensal;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setRendaMensal(BigDecimal rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Pessoa other = (Pessoa) obj; return Objects.equals(id, other.id);
	}  
	
}
