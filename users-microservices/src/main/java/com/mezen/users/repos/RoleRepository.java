package com.mezen.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mezen.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}

