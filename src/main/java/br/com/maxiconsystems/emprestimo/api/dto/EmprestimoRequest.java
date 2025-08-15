package br.com.maxiconsystems.emprestimo.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EmprestimoRequest(
		
	BigDecimal percJurosMes,
	BigDecimal taxaConversao,
	BigDecimal valorSolicitado,
	Integer qtdParcela,
	LocalDate primeiroVencimento,
	LocalDate ultimoVencimento,
	Integer qtdMesesEmprestimo,
	BigDecimal valorTotalJuros,
	BigDecimal valorTotalTaxaConv,
	BigDecimal valorParcela,
	String descricao,
	LocalDate dataEmprestimo,
	String tipoMoeda,
	BigDecimal cotacaoMoeda,
	BigDecimal valorEmprestado,
	BigDecimal valorTotalPagar

) {}
