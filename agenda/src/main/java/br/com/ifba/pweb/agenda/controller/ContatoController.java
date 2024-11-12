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

import br.com.ifba.pweb.agenda.dtos.ContatoDto;
import br.com.ifba.pweb.agenda.service.ContatoService;

@RequestMapping("api/contato")
@RestController
public class ContatoController {
	private ContatoService service;

	public ContatoController(ContatoService service) {
		this.service = service;
	}

	@PostMapping("/criar")
	public ResponseEntity<ContatoDto> criar(@RequestBody @Validated ContatoDto dto) {
		service.criar(dto);

		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}

	@GetMapping("/ler/{id}")
	public ResponseEntity<ContatoDto> ler(@PathVariable Long id) {
		service.ler(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping("/atualizar")
	public ResponseEntity<ContatoDto> atualizar(ContatoDto dto) {
		service.atualizar(dto);

		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<ContatoDto> deletar(@PathVariable Long id) {
		service.deletar(id);

		return ResponseEntity.status(HttpStatus.OK).build();
	}

}