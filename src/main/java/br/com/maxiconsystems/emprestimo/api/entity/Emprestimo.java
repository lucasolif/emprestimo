package br.com.maxiconsystems.emprestimo.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;


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
	private Integer qtdParcelas;
	private String tipoMoeda;
	private BigDecimal cotacaoMoeda;
	private BigDecimal valorEmprestado;
	private BigDecimal valorTotalPagar;
	private BigDecimal valorParcela;
	private BigDecimal percJurosTotal;
	private BigDecimal valorTotalJuros;
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
	
	public Integer getQtdParcelas() {
		return qtdParcelas;
	}
	
	public void setQtdParcelas(Integer qtdParcelas) {
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
	
	
	public BigDecimal getValorParcela() {
		return valorParcela;
	}
	
	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
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

	public BigDecimal getPercJurosTotal() {
		return percJurosTotal;
	}

	public BigDecimal getValorTotalJuros() {
		return valorTotalJuros;
	}

	public void setPercJurosTotal(BigDecimal percJurosTotal) {
		this.percJurosTotal = percJurosTotal;
	}

	public void setValorTotalJuros(BigDecimal valorTotalJuros) {
		this.valorTotalJuros = valorTotalJuros;
	}
	
}
