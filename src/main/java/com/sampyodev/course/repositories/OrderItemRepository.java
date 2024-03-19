package com.sampyodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampyodev.course.entities.OrderItem;
import com.sampyodev.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
