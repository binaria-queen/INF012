package br.com.ifba.pweb.agenda.service;

import org.springframework.stereotype.Service;

import br.com.ifba.pweb.agenda.dtos.CategoriaDto;
import br.com.ifba.pweb.agenda.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository repository;
	
	public CategoriaService(CategoriaRepository repository) {
		this.repository = repository;
	}
	
	public CategoriaDto criar(CategoriaDto dto) {
		return repository.criar(dto);
	}

	public void ler(Long id) {
		repository.ler(id);
	}

	public CategoriaDto atualizar(CategoriaDto dto) {
		return repository.atualizar(dto);
	}

	public void deletar(Long id) {
		repository.deletar(id);
	}

}
