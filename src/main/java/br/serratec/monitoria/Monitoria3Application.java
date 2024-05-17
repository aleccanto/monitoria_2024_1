package br.serratec.monitoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Monitoria3Application {

	public static void main(String[] args) {
		SpringApplication.run(Monitoria3Application.class, args);
	}

	/**
	 * Sistema de vendas:
	 * 
	 * 1º - Criar a entidade pessoa com id, nome, sobrenome e data de nascimento.
	 * 
	 * 2º - Criar a entidade venda com id, descricação, valor e vendedor que vendou
	 * o produto.
	 * 
	 * 3º - Criar um endpoint que retorne todas as vendas do vendedor.
	 * 
	 */

}
