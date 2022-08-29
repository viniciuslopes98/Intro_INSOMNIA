package com.bsmsgeneration.bsmsGeneration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/bsms-generation")
public class BsmsDaGenerationController {

	@GetMapping
	public String bsmsGeneration() {
		return "BSM'S DA GENERATION:\n\nMENTALIDADES\r\n"
				+ "Orientação ao futuro \r\n"
				+ "Responsabilidade pessoal\r\n"
				+ "Mentalidade de crescimento \r\n"
				+ "Persistência \r\n"
				+ "\r\n"
				+ "HABILIDADES\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Orientação ao detalhe \r\n"
				+ "Pró-atividade\r\n"
				+ "Comunicação";
	}
	
}
