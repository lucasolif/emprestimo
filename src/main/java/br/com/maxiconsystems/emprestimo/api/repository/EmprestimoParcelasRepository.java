package br.com.maxiconsystems.emprestimo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxiconsystems.emprestimo.api.entity.EmprestimoParcelas;

public interface EmprestimoParcelasRepository extends JpaRepository<EmprestimoParcelas, Long>{

}
