package com.sampyodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampyodev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
