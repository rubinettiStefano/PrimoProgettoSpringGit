package com.generation.primoprogettospring;

import com.generation.primoprogettospring.bl.PersonBl;
import com.generation.primoprogettospring.entities.Cloth;
import com.generation.primoprogettospring.entities.Person;
import com.generation.primoprogettospring.repositories.ClothRepository;
import com.generation.primoprogettospring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

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
    @Autowired
    ClothRepository cRepo;

    //VERO "MAIN"
    @Override
    public void run(String... args) throws Exception
    {
        Person p = repo.leggiPerLingua("Java").getFirst();


        for(Cloth c:p.getClothes())
            System.out.println(c);
//        Cloth c =   Cloth.builder()
//                    .size(89)
//                    .price(10)
//                    .color("yellow")
//                    .clothType("jeans")
//                    .owner(p)
//                    .build();
//
//        cRepo.save(c);

    }
}
