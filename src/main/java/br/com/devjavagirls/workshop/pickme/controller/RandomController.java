package br.com.devjavagirls.workshop.pickme.controller;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjavagirls.workshop.pickme.entity.Person;
import br.com.devjavagirls.workshop.pickme.repository.PersonRepository;

@RestController
public class RandomController {

	private final PersonRepository personRepository;

	RandomController(PersonRepository repository) {
		this.personRepository = repository;
	}

	@GetMapping("/random")
	public Person getRandomPerson() {
		List<Person> allPeople = personRepository.findAll();
		int randomIndex = new Random().ints(0, allPeople.size()).findFirst().getAsInt();
		return allPeople.get(randomIndex);
	}
}
