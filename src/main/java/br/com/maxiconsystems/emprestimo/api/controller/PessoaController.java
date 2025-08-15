package br.com.maxiconsystems.emprestimo.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxiconsystems.emprestimo.api.dto.PessoaRequest;
import br.com.maxiconsystems.emprestimo.api.dto.PessoaResponse;
import br.com.maxiconsystems.emprestimo.api.entity.Pessoa;
import br.com.maxiconsystems.emprestimo.api.mapper.PessoaMapper;
import br.com.maxiconsystems.emprestimo.api.services.PessoaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/pessoas", produces = "application/json")
public class PessoaController {
	
	private final PessoaService pessoaService;
	private final PessoaMapper pessoaMapper;
	
	@Autowired
	public PessoaController(PessoaService pessoaService, PessoaMapper pessoaMapper) {
		this.pessoaService = pessoaService;
		this.pessoaMapper = pessoaMapper;
	}
	
	@PostMapping
	public ResponseEntity<PessoaResponse> cadastrarPessoa(@Valid @RequestBody PessoaRequest dtoPessoa) {
	
		Pessoa pessoa = pessoaMapper.converterDtoPessoa(dtoPessoa);
		Pessoa pessoaCadastrada = pessoaService.cadastrarPessoa(pessoa);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaMapper.converterPessoaDto(pessoaCadastrada));
	}
	
	@GetMapping("/buscar/{id}")
    public ResponseEntity<PessoaResponse> buscarPessoa(@PathVariable Long id) {
	    
        Pessoa pessoa = pessoaService.consultarPorId(id);
       
        return ResponseEntity.ok(pessoaMapper.converterPessoaDto(pessoa));
    }
	
	@PutMapping("/alterar/{id}")
	public ResponseEntity<PessoaResponse> alterarPessoa(@PathVariable Long id, @Valid @RequestBody PessoaRequest dtoPessoa){
		
		Pessoa pessoa = pessoaMapper.converterDtoPessoa(dtoPessoa);
		Pessoa pessoAlterada = pessoaService.alterarPessoa(id, pessoa);
		
		return ResponseEntity.ok(pessoaMapper.converterPessoaDto(pessoAlterada));
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<Void> excluirPessoa(@PathVariable Long id){
		pessoaService.excluirPessoa(id);
		
		return ResponseEntity.noContent().build();
	}
}
