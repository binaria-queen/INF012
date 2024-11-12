package br.com.ifba.pweb.agenda.service;

import org.springframework.stereotype.Service;

import br.com.ifba.pweb.agenda.dtos.ContatoDto;
import br.com.ifba.pweb.agenda.repository.ContatoRepository;

@Service
public class ContatoService {
	
	private ContatoRepository repository;
	
	public ContatoService(ContatoRepository repository) {
		this.repository = repository;
	}

	public ContatoDto criar(ContatoDto dto) {
		return repository.criar(dto);
	}

	public void ler(Long id) {
		repository.ler(id);
	}

	public ContatoDto atualizar(ContatoDto dto) {
		return repository.atualizar(dto);
	}

	public void deletar(Long id) {
		repository.deletar(id);
	}

}
