package com.RepairIt.RepairIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.RepairIt.RepairIt.entities.Equipements;



@Repository
public interface EquipementsRepository extends JpaRepository<Equipements, Long>{
    
}
