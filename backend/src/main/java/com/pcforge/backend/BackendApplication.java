package com.pcforge.backend;

import com.pcforge.backend.model.Person;
import com.pcforge.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BackendApplication {
    @Autowired
    private PersonRepository personRepository;
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            Person person = new Person();
            person.setFirstName("John");
            person.setLastName("Doe");
            personRepository.save(person);
        };
    }
}


