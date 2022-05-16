package br.com.testes.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
	private Short codigo;
	
	private String nome;
	
	private Short quantidade;
	
	private BigDecimal preco;
	
	private LocalDate dataDeValidade;
}
