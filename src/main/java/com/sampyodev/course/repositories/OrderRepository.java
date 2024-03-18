package com.sampyodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampyodev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
