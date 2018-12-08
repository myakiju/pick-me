package br.com.devjavagirls.workshop.pickme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello")
	public String hello(){
		return "Olá, JavaGirl!";
	}
	
	@GetMapping("/hello/{nome}")
	public String hello(@PathVariable String nome){
		return String.format("Olá, %s!", nome);
	}
}
