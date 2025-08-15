package br.com.maxiconsystems.emprestimo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.maxiconsystems.emprestimo.api.entity")
public class Main {
	
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/emprestimo"); 
		SpringApplication.run(Main.class, args);	
	}
	
}
