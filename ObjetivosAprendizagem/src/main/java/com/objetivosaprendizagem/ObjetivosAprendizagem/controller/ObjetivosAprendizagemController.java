package com.objetivosaprendizagem.ObjetivosAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagemController {

	@GetMapping
	public String bsmsGeneration() {
		return "\n\tNesta sexta semana do bootcamp da Generation irei aprender mais sobre SpringBoot, MySQL e INSOMNIA!!";
	}
	
}
