package com.sky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
