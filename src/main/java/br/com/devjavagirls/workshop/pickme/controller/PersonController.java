package br.com.devjavagirls.workshop.pickme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjavagirls.workshop.pickme.entity.Person;
import br.com.devjavagirls.workshop.pickme.exceptions.PersonNotFoundException;
import br.com.devjavagirls.workshop.pickme.repository.PersonRepository;

@RestController
public class PersonController {

	private final PersonRepository repository;

	PersonController(PersonRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/people")
	List<Person> findAllPeople() {
		return repository.findAll();
	}
	
	@GetMapping("/person/{id}")
	Person getOnePerson(@PathVariable Long id) throws PersonNotFoundException {
		
		return repository.findById(id)
				.orElseThrow(() -> new PersonNotFoundException(id));
	}

	@PostMapping("/person")
	Person newPerson(@RequestBody Person newEmployee) {
		return repository.save(newEmployee);
	}

	@PutMapping("/person/{id}")
	Person updatePerson(@RequestBody Person newPerson, @PathVariable Long id) {

		return repository.findById(id)
			.map(person -> {
				person.setName(newPerson.getName());
				person.setEmail(newPerson.getEmail());
				return repository.save(person);
			})
			.orElseGet(() -> {
				newPerson.setId(id);
				return repository.save(newPerson);
			});
	}

	@DeleteMapping("/person/{id}")
	void deletePerson(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
