package com.steele.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.steele.recruitment.entity.SignUp;
import com.steele.recruitment.repository.SignUpRepository;

@Controller
public class RecruitmentController {

	@Autowired
	private SignUpRepository signUpRepository;

	@GetMapping({"/", "/index", "/signup"})
	public String index(Model model) {
		model.addAttribute("signup", new SignUp());
		return "/signup/signup";
	}

	@PostMapping("/processSignup")
	public String processRegistration(SignUp signUp, Model model) {
		model.addAttribute("signup", signUp);
		signUpRepository.save(signUp);
		return "/signup/signup_success";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/user_admin/login";
	}
	
	@GetMapping({"/admin", "/user_admin"})
	public String admin() {
		return "/user_admin/admin";
	}
	
	@GetMapping("/signed_up")
	public String signedUp(Model model) {
		List<SignUp> signUps = signUpRepository.findAll();
		model.addAttribute("signUps", signUps);
		return "/user_admin/signed_up";
	}
	
	@GetMapping("/editSignUp/{id}")
	public String editSignUp(@PathVariable("id")long id, Model model) {
		SignUp signUp = signUpRepository.findById(id).get();
		model.addAttribute("signup", signUp);
		return "/user_admin/edit_signup";
	}
	
	@GetMapping("/panel_control")
	public String panelControl() {
		return "/user_admin/panel_control";
	}
	
	@GetMapping("/user_control")
	public String userControl() {
		return "/user_admin/user_control";
	}
	
	@GetMapping("/my_profile")
	public String myProfile() {
		return "/user_admin/my_profile";
	}

	@GetMapping("/logout")
	public String logout() {
		return "/user_admin/logout";
	}
}