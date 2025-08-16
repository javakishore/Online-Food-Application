package com.kishore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
