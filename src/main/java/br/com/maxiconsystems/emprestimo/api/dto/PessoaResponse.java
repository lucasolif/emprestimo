package br.com.maxiconsystems.emprestimo.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PessoaResponse (
		
	Long id, 	
	String nome, 
	String cpfCnpj, 
	String genero, 
	String email, 
	String contato, 
	boolean status, 
	LocalDate dataNascimento, 
	BigDecimal rendaMensal,
	EnderecoResponse endereco
	
) {}

