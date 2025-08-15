package br.com.maxiconsystems.emprestimo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxiconsystems.emprestimo.api.entity.Pessoa;
import br.com.maxiconsystems.emprestimo.api.exception.DadosDuplicadoException;
import br.com.maxiconsystems.emprestimo.api.repository.PessoaRepository;

@Service
public class PessoaService {

	private final PessoaRepository pessoaRepository;
	
	@Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
	
	public Pessoa cadastrarPessoa(Pessoa pessoa) {
		
		try {
			return pessoaRepository.save(pessoa);
		}catch(DadosDuplicadoException ex) {
			throw new DadosDuplicadoException("Existem dados que já pertence a outro cadastro.");
		}
	
	}
	
	public Pessoa consultarPorId(Long id) {
		return pessoaRepository.findById(id).orElseThrow();
	}
	
	public Pessoa alterarPessoa(Long id, Pessoa pessoaAlterar) {
		
		Pessoa pessoa = consultarPorId(id); 
		
		pessoa.setContato(pessoaAlterar.getContato());
		pessoa.setCpfCnpj(pessoaAlterar.getCpfCnpj());
		pessoa.setDataNascimento(pessoaAlterar.getDataNascimento());
		pessoa.setEmail(pessoaAlterar.getEmail());
		pessoa.setEndereco(pessoaAlterar.getEndereco());
		pessoa.setGenero(pessoaAlterar.getGenero());
		pessoa.setNome(pessoaAlterar.getNome());
		pessoa.setRendaMensal(pessoaAlterar.getRendaMensal());
		pessoa.setStatus(pessoaAlterar.isStatus());
		
		return pessoaRepository.save(pessoa);
	
	}
	
	public Pessoa excluirPessoa(Long id) {
		
		Pessoa pessoa = consultarPorId(id); 
		pessoa.setStatus(false);
		
		return pessoaRepository.save(pessoa);
	
	}
}
