package com.RepairIt.RepairIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepairIt.RepairIt.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    Client  findFirstByUsernameAndPassword(String username, String password);
}
