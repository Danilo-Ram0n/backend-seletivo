package com.example.backendseletivo.repository;

import com.example.backendseletivo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
