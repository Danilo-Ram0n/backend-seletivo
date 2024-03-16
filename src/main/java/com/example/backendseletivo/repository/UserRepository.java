package com.example.backendseletivo.repository;

import com.example.backendseletivo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface responsável por fornecer métodos CRUD para a entidade User
public interface UserRepository extends JpaRepository<User, Long> {

}
