package com.projeto.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projeto.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
