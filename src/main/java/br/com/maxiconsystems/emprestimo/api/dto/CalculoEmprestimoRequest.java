package br.com.maxiconsystems.emprestimo.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CalculoEmprestimoRequest(
		
	@NotBlank LocalDate dataEmprestimo, 
	@NotBlank String tipoMoeda, 
	@Positive Integer qtdParcela, 
	@Positive BigDecimal cotacaoMoeda, 
	@Positive BigDecimal valorSolicitado, 
	@Future LocalDate dataVencimento
	
) {}
