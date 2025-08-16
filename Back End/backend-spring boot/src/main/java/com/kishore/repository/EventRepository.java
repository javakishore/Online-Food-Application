package com.kishore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.model.Events;

public interface EventRepository extends JpaRepository<Events, Long>{

	public List<Events> findEventsByRestaurantId(Long id);
}
