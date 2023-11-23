package com.app.FixIt.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.FixIt.entities.Client;
import com.app.FixIt.entities.Taches;
import java.util.List;


@Repository
public interface TachesRepository extends JpaRepository<Taches, Long>{
    List<Taches> findByClient(Client client);
}
