package br.com.devjavagirls.workshop.pickme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devjavagirls.workshop.pickme.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
