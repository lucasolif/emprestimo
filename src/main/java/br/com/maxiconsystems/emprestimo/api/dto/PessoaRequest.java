package br.com.maxiconsystems.emprestimo.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PositiveOrZero;

public record PessoaRequest(
		
	@NotBlank String nome, 
	@NotBlank String cpfCnpj, 
	@NotBlank String genero, 
	@Email String email, 
	@NotBlank String contato, 
	@NotBlank boolean status, 
	@Past LocalDate dataNascimento, 
	@PositiveOrZero BigDecimal rendaMensal,
	@Valid EnderecoRequest endereco
	
) {}
