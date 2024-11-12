package br.com.ifba.pweb.agenda.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity(name="contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório.")
	private String nome;
	
	@NotBlank(message = "O telefone é obrigatório.")
	private String telefone;
	
	private String email;
	
	@ManyToOne
	private Categoria categoria;
	
}
