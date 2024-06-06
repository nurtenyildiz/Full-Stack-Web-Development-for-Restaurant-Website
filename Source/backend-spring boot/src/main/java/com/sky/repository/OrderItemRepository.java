package com.sky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
