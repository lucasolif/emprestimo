package br.com.maxiconsystems.emprestimo.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoaEmprestimo")
public class PessoaEmprestimo {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne
    @JoinColumn(nullable = false)
	private Pessoa pessoaId;
    
    @ManyToOne
    @JoinColumn(nullable = false)
	private Emprestimo emprestimoId;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Pessoa getPessoaId() {
		return pessoaId;
	}
	
	public void setPessoaId(Pessoa pessoaId) {
		this.pessoaId = pessoaId;
	}
	
	public Emprestimo getEmprestimoId() {
		return emprestimoId;
	}
	
	public void setEmprestimoId(Emprestimo emprestimoId) {
		this.emprestimoId = emprestimoId;
	}
	
	 
}
