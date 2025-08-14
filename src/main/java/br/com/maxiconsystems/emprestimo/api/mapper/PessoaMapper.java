package br.com.maxiconsystems.emprestimo.api.mapper;

import org.springframework.stereotype.Component;

import br.com.maxiconsystems.emprestimo.api.dto.PessoaRequest;
import br.com.maxiconsystems.emprestimo.api.dto.PessoaResponse;
import br.com.maxiconsystems.emprestimo.api.entity.Pessoa;

@Component
public class PessoaMapper {
	
	private final EnderecoMapper enderecoMapper;
	
	public PessoaMapper(EnderecoMapper enderecoMapper) {
		this.enderecoMapper = enderecoMapper;
	}

	public Pessoa converterDtoPessoa(PessoaRequest dtoPessoa) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setContato(dtoPessoa.contato());
		pessoa.setCpfCnpj(dtoPessoa.cpfCnpj());
		pessoa.setDataNascimento(dtoPessoa.dataNascimento());
		pessoa.setEmail(dtoPessoa.email());
		pessoa.setEndereco(enderecoMapper.converterDtoEndereco(dtoPessoa.endereco()));
		pessoa.setGenero(dtoPessoa.genero());
		pessoa.setNome(dtoPessoa.nome());
		pessoa.setRendaMensal(dtoPessoa.rendaMensal());
		pessoa.setStatus(dtoPessoa.status());
		
		return pessoa;
	}
	
	public PessoaResponse converterPessoaDto(Pessoa pessoa) {
		return new PessoaResponse(
			pessoa.getId(),
			pessoa.getNome(),
			pessoa.getCpfCnpj(),
			pessoa.getGenero(),
			pessoa.getEmail(),
			pessoa.getContato(),
			pessoa.isStatus(),
			pessoa.getDataNascimento(),
			pessoa.getRendaMensal(),
			enderecoMapper.converterEnderecoDto(pessoa.getEndereco())
		);
	}
}
