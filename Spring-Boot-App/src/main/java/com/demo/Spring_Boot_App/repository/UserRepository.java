// File: UserRepository.java
package com.demo.Spring_Boot_App.repository;

import com.demo.Spring_Boot_App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
