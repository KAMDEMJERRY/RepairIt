package com.app.FixIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.FixIt.entities.Client;
import java.util.List;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    Client  findFirstByUsernameAndPassword(String username, String password);
}
