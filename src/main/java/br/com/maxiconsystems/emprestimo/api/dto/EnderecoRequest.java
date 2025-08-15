package br.com.maxiconsystems.emprestimo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record EnderecoRequest(
		
	@NotBlank @Size(max = 120) String logradouro,
	@NotBlank @Size(max = 120) String cidade,
	@NotBlank @Size(max = 2) String estado,
	@NotBlank @Size(max = 60) String bairro,
	@NotBlank @Size(max = 10) String numero,
	@Size(max = 150) String complemento,
	@Pattern(regexp="\\d{5}-?\\d{3}") @Size(max = 9) String cep
		
){}
