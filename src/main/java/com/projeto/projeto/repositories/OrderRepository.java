package com.projeto.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
