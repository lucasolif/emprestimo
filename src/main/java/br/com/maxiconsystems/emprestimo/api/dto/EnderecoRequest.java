package br.com.maxiconsystems.emprestimo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoRequest(
		
	@NotBlank String logradouro,
	@NotBlank String cidade,
	@NotBlank String estado,
	@NotBlank String bairro,
	@NotBlank String numero,
	String complemento,
	@Pattern(regexp="\\d{5}-?\\d{3}") String cep
		
){}
