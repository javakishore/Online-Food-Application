package com.kishore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
