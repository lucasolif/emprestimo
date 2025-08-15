package br.com.maxiconsystems.emprestimo.api.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxiconsystems.emprestimo.api.dto.CalculoEmprestimoRequest;
import br.com.maxiconsystems.emprestimo.api.dto.CalculoEmprestimoResponse;
import br.com.maxiconsystems.emprestimo.api.entity.Emprestimo;
import br.com.maxiconsystems.emprestimo.api.repository.EmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired
	private EmprestimoRepository emprestimoRepository;
	@Autowired
	private EmprestimoParcelasService emprestimoParcelasService;

	
	public Emprestimo cadastrar(Emprestimo emprestimo) {
		
		try{
			Emprestimo emprestimoCadastrado = emprestimoRepository.save(emprestimo);
			
			emprestimoParcelasService.cadastrarParcelas(emprestimoCadastrado);
		
		}catch(Exception ex) {
			
		}
		
		return null;
	}
	
	
	public CalculoEmprestimoResponse calcularEmprestimo(CalculoEmprestimoRequest dadosCalcEmprestimo) {
		
		BigDecimal percJurosMes = BigDecimal.valueOf(0.07);
		BigDecimal cotacaoMoeda = BigDecimal.valueOf(0.07);
		BigDecimal taxaConversao = BigDecimal.valueOf(0.20);
		BigDecimal valorSolicitado = dadosCalcEmprestimo.valorSolicitado();
		Integer qtdParcela = dadosCalcEmprestimo.qtdParcela();
		LocalDate dataEmprestimo = dadosCalcEmprestimo.dataEmprestimo();
		LocalDate primeiroVencimento = dataEmprestimo.plusMonths(1);	
		LocalDate ultimoVencimento = obterVencimentoDataFinal(dataEmprestimo, qtdParcela);
		Integer qtdMesesEmprestimo = obterQuantidadeMesesEmprestimo(dataEmprestimo, ultimoVencimento);
		
		// Estou levando em consideração desde a liberação do emprestimo
		BigDecimal percTotalJuros = BigDecimal.ONE.add(percJurosMes).pow(qtdMesesEmprestimo);
		BigDecimal valTotalJuros = valorSolicitado.subtract(valorSolicitado.multiply(percTotalJuros));
		BigDecimal valTotalTaxaConv = valorSolicitado.multiply(taxaConversao);
		
		BigDecimal valorTotalPagar = BigDecimal.ZERO;
		valorTotalPagar = valorTotalPagar.add(valTotalJuros);
		valorTotalPagar = valorTotalPagar.add(valTotalTaxaConv);
		
		BigDecimal valorParcela = valorTotalPagar.divide(BigDecimal.valueOf(qtdParcela));
		
		return new CalculoEmprestimoResponse(
			percJurosMes,
			taxaConversao,
			valorSolicitado,
			qtdParcela,
			primeiroVencimento,
			ultimoVencimento,
			qtdMesesEmprestimo,
			valTotalJuros,
			valTotalTaxaConv,
			valorParcela,
			cotacaoMoeda
		);
		
	}
	
	private LocalDate obterVencimentoDataFinal(LocalDate dataCadastro, Integer qtdParcela) {
		
		LocalDate primeiroVenc = dataCadastro.plusMonths(1);
		LocalDate ultimoVenc = primeiroVenc.plusMonths(qtdParcela);
		
		return ultimoVenc;
	}
	
	private Integer obterQuantidadeMesesEmprestimo(LocalDate dataCadastro, LocalDate ultimoVencimento) {
		
		Period diferencaMeses = Period.between(dataCadastro, ultimoVencimento);
		Integer qtdMeses = diferencaMeses.getMonths();
		
		return qtdMeses;
	}
	
	
}
