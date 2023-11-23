package com.app.FixIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FixIt.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    // User findByUsername(String Username);
    User findFirstByIdAndUsername(Object id, String username);
    User findFirstByUsernameAndPassword(String username, String password);
}
