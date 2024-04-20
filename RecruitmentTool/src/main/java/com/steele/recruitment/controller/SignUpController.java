package com.steele.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steele.recruitment.entity.SignUp;
import com.steele.recruitment.repository.SignUpRepository;

@Controller
public class SignUpController {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	@RequestMapping("/editSignUp")
	public String deleteBook(SignUp signUp) {
		System.out.println("saving changes ...");
		signUp.displaySignUpInfoToConsole();
		signUpRepository.save(signUp);
		return "/signed_up";
	}

	@RequestMapping("/deleteSignUp/{id}")
	public String deleteBook(@PathVariable("id")long id) {
		signUpRepository.deleteById(id);
		return "redirect:/signed_up";
	}
}