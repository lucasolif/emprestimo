package br.com.maxiconsystems.emprestimo.api.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    
    
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
    
}
