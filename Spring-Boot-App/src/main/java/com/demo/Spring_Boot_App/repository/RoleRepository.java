// File: RoleRepository.java
package com.demo.Spring_Boot_App.repository;

import com.demo.Spring_Boot_App.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
