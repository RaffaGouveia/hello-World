package com.generation.hello_World.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloController {
	
	@GetMapping
	public String helloWorld(){
		return "Hello World!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidade de crescimento\n"
				+ "Persistência\n"
				+ "Responsabilidade Pessoal\n"
				+ "Comunicação\n"
				+ "Orientação ao detalhe\n"
				+ "Proatividade\n"
				+ "Trabalho em equipe\n";
	}
	@GetMapping("/aprender")
	public String aprender() {
		return "Desejo aprender sobre novas tecnologias e técnicas sobre computação\n"
				+ "além de aprender novas habilidades e aprimorar minhas competências";
	}
}
