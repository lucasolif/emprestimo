package br.com.maxiconsystems.emprestimo.api.dto;

public record EnderecoResponse(
	String logradouro,
	String cidade,
	String estado,
	String bairro,
	String numero,
	String complemento,
	String cep		
) {}
