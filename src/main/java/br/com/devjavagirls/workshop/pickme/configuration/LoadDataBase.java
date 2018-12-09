package br.com.devjavagirls.workshop.pickme.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.devjavagirls.workshop.pickme.entity.Person;
import br.com.devjavagirls.workshop.pickme.repository.PersonRepository;

@Configuration
class LoadDatabase {

	Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Bean
	CommandLineRunner initDatabase(PersonRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Person("Nara Sakamoto", "email@nara.com")));
			log.info("Preloading " + repository.save(new Person("Juliana Myaki", "email@juliana.com")));
		};
	}
}