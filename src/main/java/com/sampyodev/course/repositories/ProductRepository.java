package com.sampyodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampyodev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
