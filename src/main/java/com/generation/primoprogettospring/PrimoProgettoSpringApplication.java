package com.generation.primoprogettospring;

import com.generation.primoprogettospring.bl.PersonBl;
import com.generation.primoprogettospring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimoProgettoSpringApplication implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(PrimoProgettoSpringApplication.class, args);
    }

    @Autowired
    PersonRepository repo;

    @Autowired
    PersonBl bl;

    //VERO "MAIN"
    @Override
    public void run(String... args) throws Exception
    {
        bl.stampaTuttePersone();

    }
}
