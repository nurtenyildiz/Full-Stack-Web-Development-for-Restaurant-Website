package com.sky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
