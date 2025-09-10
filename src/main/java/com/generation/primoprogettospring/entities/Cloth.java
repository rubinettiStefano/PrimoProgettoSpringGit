package com.generation.primoprogettospring.entities;

import jakarta.persistence.*;
import lombok.*;

//un singolo vestito
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Cloth
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clothType,color;
    private int size;
    private double price;

    //RELAZIONE
    //relazione N-1
    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    private Person owner;
}
