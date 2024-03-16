package com.example.backendseletivo.service;

import com.example.backendseletivo.entity.User;
import com.example.backendseletivo.repository.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> create(User user) {
        userRepository.save(user);
        return list();
    }

    // Método para listar todos os usuários, ordenados por nome e idade
    public List<User> list() {
       Sort sort = Sort.by("nome").descending().and(Sort.by("idade"));
       return userRepository.findAll(sort);
    }

    public List<User> update(User user) {
        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        existingUser.setNome(user.getNome());
        existingUser.setCpf(user.getCpf());
        existingUser.setIdade(user.getIdade());
        existingUser.setSexo(user.getSexo());

        userRepository.save(existingUser);

        return list();
    }

    public List<User> delete(Long id) {
        userRepository.deleteById(id);
        return list();
    }

}
