package com.RepairIt.RepairIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepairIt.RepairIt.entities.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByIdAndUsername(Object id, String username);
    User findFirstByUsernameAndPassword(String username, String password);
}
