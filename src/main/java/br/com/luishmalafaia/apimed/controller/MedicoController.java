package br.com.luishmalafaia.apimed.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luishmalafaia.apimed.medico.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		System.out.println(dados);
	}
	
}
