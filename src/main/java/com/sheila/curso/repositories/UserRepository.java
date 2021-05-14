package com.sheila.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheila.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
