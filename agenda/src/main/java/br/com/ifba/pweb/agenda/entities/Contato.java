package br.com.ifba.pweb.agenda.entities;

import org.springframework.data.annotation.Id;

@Entity()
public class Contato {

	@Id
	private Long id;
	
	private String nome;
	private String telefone;
	private String email;
	
}
