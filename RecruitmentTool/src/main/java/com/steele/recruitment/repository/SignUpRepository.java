package com.steele.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.steele.recruitment.entity.SignUp;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
//	
//	@Query("SELECT u FROM signup u WHERE u.email = ?1")
//	SignUp findByEmail(String emailAddress);

}
