package com.app.FixIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.FixIt.entities.Equipements;

@Repository
public interface EquipementsRepository extends JpaRepository<Equipements, Long>{
    
}
