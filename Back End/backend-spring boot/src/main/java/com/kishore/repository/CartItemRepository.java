package com.kishore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
