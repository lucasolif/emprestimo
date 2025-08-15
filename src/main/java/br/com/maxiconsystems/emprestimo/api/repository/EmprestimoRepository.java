package br.com.maxiconsystems.emprestimo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxiconsystems.emprestimo.api.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}
