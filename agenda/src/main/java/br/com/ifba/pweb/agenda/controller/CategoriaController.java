package br.com.ifba.pweb.agenda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifba.pweb.agenda.dtos.CategoriaDto;
import br.com.ifba.pweb.agenda.service.CategoriaService;

@RequestMapping("api/categoria")
@RestController
public class CategoriaController {
	
	private CategoriaService service;
	
	public CategoriaController(CategoriaService service) {
		this.service = service;
	}

	@PostMapping("/criar")
	public ResponseEntity<CategoriaDto> criar(@RequestBody @Validated CategoriaDto dto){
		service.criar(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}
	
	@GetMapping("/ler/{id}")
	public ResponseEntity<CategoriaDto> ler(@PathVariable Long id){
		service.ler(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<CategoriaDto> atualizar(CategoriaDto dto){
		service.atualizar(dto);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<CategoriaDto> deletar(@PathVariable Long id){
		service.deletar(id);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	
	
}
