package br.com.maxiconsystems.emprestimo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxiconsystems.emprestimo.api.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
