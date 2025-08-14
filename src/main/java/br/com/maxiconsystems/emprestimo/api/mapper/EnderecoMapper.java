package br.com.maxiconsystems.emprestimo.api.mapper;

import org.springframework.stereotype.Component;

import br.com.maxiconsystems.emprestimo.api.dto.EnderecoRequest;
import br.com.maxiconsystems.emprestimo.api.dto.EnderecoResponse;
import br.com.maxiconsystems.emprestimo.api.entity.Endereco;

@Component
public class EnderecoMapper {
	
	public Endereco converterDtoEndereco(EnderecoRequest dtoEndereco) {
			
		Endereco endereco = new Endereco();		
		endereco.setBairro(dtoEndereco.bairro());
		endereco.setCep(dtoEndereco.cep());
		endereco.setCidade(dtoEndereco.cidade());
		endereco.setComplemento(dtoEndereco.complemento());
		endereco.setEstado(dtoEndereco.estado());
		endereco.setLogradouro(dtoEndereco.logradouro());
		endereco.setNumero(dtoEndereco.numero());
		
		return endereco;
	}
	
	public EnderecoResponse converterEnderecoDto(Endereco endereco) {
		return new EnderecoResponse(
				
			endereco.getLogradouro(),
			endereco.getCidade(),
			endereco.getEstado(),
			endereco.getBairro(),
			endereco.getNumero(),
			endereco.getComplemento(),
			endereco.getCep()	
		);
				
	}
}
