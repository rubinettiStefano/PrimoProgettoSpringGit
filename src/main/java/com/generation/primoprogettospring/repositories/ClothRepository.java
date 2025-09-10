package com.generation.primoprogettospring.repositories;

import com.generation.primoprogettospring.entities.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClothRepository extends JpaRepository<Cloth,Long>
{
    @Query("SELECT c FROM Cloth c WHERE c.owner.language= :lingua")
    List<Cloth> prendiPerLinguaDelProprietario(String lingua);
}
