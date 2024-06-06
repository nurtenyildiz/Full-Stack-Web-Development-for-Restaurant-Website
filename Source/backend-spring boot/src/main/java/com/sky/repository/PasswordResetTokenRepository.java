package com.sky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
