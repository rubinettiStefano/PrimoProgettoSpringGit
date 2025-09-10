package com.generation.primoprogettospring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor //il costruttore con tutti i parametri
@NoArgsConstructor  //il costruttore vuoto
@Data  //getter+setter+toString+requiredArgsConstructor (costruttore con tutte le proprietà non nullabili)
@Builder // modo alternativo al costruttore per istanziare oggetti
@Entity //che vogliamo avere una TABELLA sul db per gli oggetti di questa classe
public class Person
{
    @Id //definendo come primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// AUTOINCREMENT
    private Long id;

    private String name, surname;
    private LocalDate dob; // Date of birth
    private String language;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Cloth> clothes =  new ArrayList<>();

}
