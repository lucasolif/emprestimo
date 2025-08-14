package br.com.maxiconsystems.emprestimo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxiconsystems.emprestimo.api.entity.Pessoa;
import br.com.maxiconsystems.emprestimo.api.exception.DadosDuplicadoException;
import br.com.maxiconsystems.emprestimo.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa cadastrar(Pessoa pessoa) {
		
		try {
			return pessoaRepository.save(pessoa);
		}catch(DadosDuplicadoException ex) {
			throw new DadosDuplicadoException("Existem dados que já pertence a outro cadastro.");
		}
	
	}
}
