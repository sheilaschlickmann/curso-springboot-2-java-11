package com.sheila.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheila.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
