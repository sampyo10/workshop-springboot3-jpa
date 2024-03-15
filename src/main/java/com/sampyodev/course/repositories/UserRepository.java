package com.sampyodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampyodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
