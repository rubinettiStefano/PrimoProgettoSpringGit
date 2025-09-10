package com.generation.primoprogettospring.bl;

import com.generation.primoprogettospring.entities.Person;
import com.generation.primoprogettospring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonBlImpl implements PersonBl
{
    //necessitiamo di funzionalità di CRUD per le Person
    //in quale interfaccia sono dichiarate tali funzionalità?
    //devo chiedere a Spring di darmi un oggetto di tale interfaccia

    @Autowired
    PersonRepository repo;

    @Override
    public void stampaTuttePersone()
    {
        for(Person p: repo.findAll())
            System.out.println(p.getName()+" "+p.getSurname());
    }
}
