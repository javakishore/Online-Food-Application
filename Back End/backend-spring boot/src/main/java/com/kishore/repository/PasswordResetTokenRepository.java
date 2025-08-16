package com.kishore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
