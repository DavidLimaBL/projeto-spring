package com.projeto.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
