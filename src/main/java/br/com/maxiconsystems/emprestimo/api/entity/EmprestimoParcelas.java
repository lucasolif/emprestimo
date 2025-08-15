package br.com.maxiconsystems.emprestimo.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimoParcelas")
public class EmprestimoParcelas {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne
    @JoinColumn(nullable = false)
	private Emprestimo emprestimoId;
	private LocalDate dataVencimento;
	private LocalDate dataCadastro;
	private LocalDate dataPagamento;
	private BigDecimal valorParcela;
	private BigDecimal valorPendente;
	private BigDecimal valorPago;
	private Integer parcela;
	private String status;
	
	
	public Long getId() {
		return id;
	}
	
	public Emprestimo getEmprestimoId() {
		return emprestimoId;
	}
	
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	
	public BigDecimal getValorParcela() {
		return valorParcela;
	}
	
	public BigDecimal getValorPendente() {
		return valorPendente;
	}
	
	public BigDecimal getValorPago() {
		return valorPago;
	}
	
	public Integer getParcela() {
		return parcela;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setEmprestimoId(Emprestimo emprestimoId) {
		this.emprestimoId = emprestimoId;
	}
	
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	public void setValorPendente(BigDecimal valorPendente) {
		this.valorPendente = valorPendente;
	}
	
	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
	
	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
