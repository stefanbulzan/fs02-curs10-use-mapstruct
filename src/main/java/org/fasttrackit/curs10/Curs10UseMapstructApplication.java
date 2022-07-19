package org.fasttrackit.curs10;

import org.fasttrackit.curs10.model.Person;
import org.fasttrackit.curs10.model.PersonEntity;
import org.fasttrackit.curs10.model.mappers.PersonMappers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Curs10UseMapstructApplication {

    public static void main(String[] args) {
        SpringApplication.run(Curs10UseMapstructApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(PersonMappers personMappers) {
        return args -> {
            PersonEntity maria = new PersonEntity("Maria", "Popescu", "Oradea", 42);
            Person person = personMappers.toApi(maria);
            System.out.println(person);
            System.out.println(personMappers.toEntity(person));

            System.out.println(personMappers.customMapping(maria));
        };
    }
}