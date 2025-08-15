package br.com.maxiconsystems.emprestimo.api.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.maxiconsystems.emprestimo.api.entity.Emprestimo;
import br.com.maxiconsystems.emprestimo.api.entity.EmprestimoParcelas;
import br.com.maxiconsystems.emprestimo.api.repository.EmprestimoParcelasRepository;

@Service
public class EmprestimoParcelasService {
	
	@Autowired
	private EmprestimoParcelasRepository emprestimoParcelasRepository;
	
	@Transactional
	public void cadastrarParcelas(Emprestimo emprestimo) {
		
		List<EmprestimoParcelas> listaParcelas = new ArrayList<>();
		
		for(Integer i = 1; i <= emprestimo.getQtdParcelas(); i++) {
			
			EmprestimoParcelas parcela = new EmprestimoParcelas();
			parcela.setDataCadastro(emprestimo.getDataEmprestimo());
			parcela.setDataVencimento(emprestimo.getDataEmprestimo().plusMonths(i));
			parcela.setEmprestimoId(emprestimo);
			parcela.setParcela(i);
			parcela.setStatus("A");
			parcela.setValorPago(BigDecimal.ZERO);
			parcela.setValorParcela(emprestimo.getValorParcela());
			parcela.setValorPendente(emprestimo.getValorParcela());
			
			listaParcelas.add(parcela);
		}

		emprestimoParcelasRepository.saveAll(listaParcelas);
	}

}
