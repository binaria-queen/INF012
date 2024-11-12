package br.com.ifba.pweb.agenda.entities;

import org.springframework.data.annotation.Id;

@Entity
public class Categoria {

	@Id
	private Long id;
	
	private String nome;
	
}
