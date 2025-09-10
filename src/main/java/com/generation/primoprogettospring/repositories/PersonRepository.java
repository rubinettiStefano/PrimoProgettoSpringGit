package com.generation.primoprogettospring.repositories;

import com.generation.primoprogettospring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long>
{
}
