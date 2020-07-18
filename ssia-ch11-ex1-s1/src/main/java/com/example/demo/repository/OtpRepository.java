package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Otp;

public interface OtpRepository extends JpaRepository<Otp, String> {
	
	Optional<Otp> findOtpByUsername(String username);
	
}
