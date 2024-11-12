package br.com.ifba.pweb.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifba.pweb.agenda.dtos.CategoriaDto;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaDto, Long>{
	
	CategoriaDto criar(CategoriaDto dto);
	CategoriaDto ler(Long id);
	CategoriaDto atualizar(CategoriaDto dto);
	void deletar(Long id);

}
