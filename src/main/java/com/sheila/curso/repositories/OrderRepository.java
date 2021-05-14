package com.sheila.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheila.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
