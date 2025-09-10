package com.generation.primoprogettospring.repositories;

import com.generation.primoprogettospring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//una interfaccia ne può estendere un'altra
public interface PersonRepository extends JpaRepository<Person,Long>
{
}
