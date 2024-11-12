package br.com.ifba.pweb.agenda.dtos;

import br.com.ifba.pweb.agenda.entities.Categoria;

public class ContatoDto {

	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private Categoria categoria;

	public ContatoDto(Long id, String nome, String telefone, String email, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ContatoDto [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
				+ ", categoria=" + categoria + "]";
	}

}
