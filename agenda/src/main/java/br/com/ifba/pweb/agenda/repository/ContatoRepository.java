package br.com.ifba.pweb.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifba.pweb.agenda.dtos.ContatoDto;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoDto, Long>{

	ContatoDto criar(ContatoDto dto);
	ContatoDto ler(Long id);
	ContatoDto atualizar(ContatoDto dto);
	void deletar(Long id);
}
