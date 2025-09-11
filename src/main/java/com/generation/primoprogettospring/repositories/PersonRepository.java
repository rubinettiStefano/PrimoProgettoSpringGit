package com.generation.primoprogettospring.repositories;

import com.generation.primoprogettospring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

//una interfaccia ne può estendere un'altra
public interface PersonRepository extends JpaRepository<Person,Long>
{
    // WHERE language=parametro
    @Query("select p FROM Person p WHERE p.language = :lingua")
    List<Person> leggiPerLingua(String lingua);

    @Query("select p FROM Person p WHERE p.dob <= :data")
    List<Person> leggiNatiPrimaDi(LocalDate data);

    @Query("select p FROM Person p WHERE YEAR(p.dob) = :anno")
    List<Person> leggiNatiIl(int anno);


    @Query("select p FROM Person p WHERE p.name like :iniziale%")
    List<Person> leggiPerIniziale(String  iniziale);

    @Query("select p FROM Person p WHERE p.language = :lingua AND YEAR(p.dob) = :anno")
    List<Person> leggiPerLinguaEAnno(String  lingua,int anno);
    //metodo per prendere tutte persone che iniziano con lettera passata come parametro (passatela come String)
    //metodo per prendere tutte le persone che parlano una lingua passata come parametro
    //e che sono nati in un certo anno


}
