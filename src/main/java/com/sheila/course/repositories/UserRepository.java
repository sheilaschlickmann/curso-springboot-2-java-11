package com.sheila.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheila.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
