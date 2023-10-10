package com.projeto.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projeto.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
