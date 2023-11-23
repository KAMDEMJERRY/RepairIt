package com.app.FixIt.repository;

// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.app.FixIt.entities.Maintenancier;
import java.util.List;


@Repository
public interface MaintenancierRepository extends JpaRepository<Maintenancier, Long>{
    List<Maintenancier> findByStatus(Boolean status);
    Maintenancier findFirstByUsernameAndPassword(String username, String password);
}
