package com.generation.primoprogettospring;

import com.generation.primoprogettospring.entities.Person;
import com.generation.primoprogettospring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class PrimoProgettoSpringApplication implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(PrimoProgettoSpringApplication.class, args);
    }

    @Autowired
    PersonRepository repo;

    //VERO "MAIN"
    @Override
    public void run(String... args) throws Exception
    {

//        //        new Person()
//        Person p =  Person
//                    .builder()//fa partire costruzione
//                    .name("Gabriel")
//                    .surname("Raffaele")
//                    .language("Italian")
//                    .dob(LocalDate.parse("1996-04-25"))
//                    .build();//termina,creando oggetto
//
//        repo.save(p);

//        List<Person> tuttiNelDb = repo.findAll();
//
//        for(Person p : tuttiNelDb)
//            System.out.println(p.getName());

//        Optional<Person> gabriel = repo.findById(2L);
//
//        Person p = gabriel.orElse(null);//estrailo dalla scatole

//        p.setDob(p.getDob().minusMonths(1));
//
//        //se un oggetto non è nel db lo crea
//        //se è stato letto e poi modificato allora fa update
//        repo.save(p);

        //Gabriel ha fatto qualcosa che non doveva
        repo.deleteById(1L);
    }
}
