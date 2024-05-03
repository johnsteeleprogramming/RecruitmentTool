package com.steele.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.service.annotation.GetExchange;

import com.steele.recruitment.entity.SignUp;
import com.steele.recruitment.repository.SignUpRepository;

@Controller
public class SignUpController {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	@PostMapping("/updateSignUp/{id}")
	public String updateSignUp(@PathVariable("id") long id, SignUp signUp) {
		SignUp databaseSignUp = signUpRepository.findById(id).get();
		databaseSignUp.setEmailAddress(signUp.getEmailAddress());
		databaseSignUp.setFirstName(signUp.getFirstName());
		databaseSignUp.setLastName(signUp.getLastName());
		databaseSignUp.setPhoneNumber(signUp.getPhoneNumber());
		signUpRepository.save(databaseSignUp);
		return "redirect:/signed_up";
	}

	@GetExchange("/deleteSignUp/{id}")
	public String deleteSignUp(@PathVariable("id")long id) {
		signUpRepository.deleteById(id);
		return "redirect:/signed_up";
	}
}