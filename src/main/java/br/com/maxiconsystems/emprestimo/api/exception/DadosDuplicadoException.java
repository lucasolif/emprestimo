package br.com.maxiconsystems.emprestimo.api.exception;

@SuppressWarnings("serial")
public class DadosDuplicadoException extends RuntimeException{

	public DadosDuplicadoException(String mensagem) {
		super(mensagem);
	}
}
