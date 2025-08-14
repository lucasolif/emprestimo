package br.com.maxiconsystems.emprestimo.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimos")
public class Emprestimo {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private LocalDate dataEmprestimo;
	private Long qtdParcelas;
	private String tipoMoeda;
	private BigDecimal cotacaoMoeda;
	private BigDecimal valorEmprestado;
	private BigDecimal valorTotalPagar;
	private BigDecimal valorParcela;
	private BigDecimal percentualJurosMensal;
	private BigDecimal taxaConversao;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public Long getQtdParcelas() {
		return qtdParcelas;
	}
	
	public void setQtdParcelas(Long qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
	public String getTipoMoeda() {
		return tipoMoeda;
	}
	
	public void setTipoMoeda(String tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}
	
	public BigDecimal getCotacaoMoeda() {
		return cotacaoMoeda;
	}
	
	public void setCotacaoMoeda(BigDecimal cotacaoMoeda) {
		this.cotacaoMoeda = cotacaoMoeda;
	}
	
	public BigDecimal getValorEmprestimo() {
		return valorEmprestimo;
	}
	
	public void setValorEmprestimo(BigDecimal valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
	public BigDecimal getValorParcela() {
		return valorParcela;
	}
	
	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	public BigDecimal getPercentualJurosMensal() {
		return percentualJurosMensal;
	}
	
	public void setPercentualJurosMensal(BigDecimal percentualJurosMensal) {
		this.percentualJurosMensal = percentualJurosMensal;
	}
	
	public BigDecimal getTaxaConversao() {
		return taxaConversao;
	}
	
	public void setTaxaConversao(BigDecimal taxaConversao) {
		this.taxaConversao = taxaConversao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorEmprestado() {
		return valorEmprestado;
	}

	public void setValorEmprestado(BigDecimal valorEmprestado) {
		this.valorEmprestado = valorEmprestado;
	}

	public BigDecimal getValorTotalPagar() {
		return valorTotalPagar;
	}

	public void setValorTotalPagar(BigDecimal valorTotalPagar) {
		this.valorTotalPagar = valorTotalPagar;
	}
	
	
}
