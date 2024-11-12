package br.com.ifba.pweb.agenda.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório.")
	private String nome;
	
	@OneToMany
	private List<Contato> contato;
	
}
