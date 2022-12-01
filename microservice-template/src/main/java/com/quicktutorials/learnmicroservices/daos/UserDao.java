package com.quicktutorials.learnmicroservices.daos;

import com.quicktutorials.learnmicroservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, String> {
    //custom
    Optional<User> findById(String id);
}
