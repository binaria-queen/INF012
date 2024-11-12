package br.com.ifba.pweb.agenda.dtos;

import br.com.ifba.pweb.agenda.entities.Contato;

public class CategoriaDto {

	private Long id;
	private String nome;
	private Contato contato;

	public CategoriaDto(Long id, String nome, Contato contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "CategoriaDto [id=" + id + ", nome=" + nome + ", contato=" + contato + "]";
	}

	
}
