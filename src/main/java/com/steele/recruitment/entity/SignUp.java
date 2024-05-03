package com.steele.recruitment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "signups")
public class SignUp {

	@Id
	@Column(name="signupid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long signUpId;

	@Column(name="emailaddress")
	private String emailAddress;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

	public SignUp() {
		super();
	}

	public SignUp(String emailAddress, String phoneNumber, String firstName, String lastName) {
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getSignUpId() {
		return signUpId;
	}

	public void setSignUpId(int signUpId) {
		this.signUpId = signUpId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void displaySignUpInfoToConsole() {
		System.out.println("SignUp info");
		System.out.println("ID:\t\t" + this.getSignUpId());
		System.out.println("Email Address:\t" + this.getEmailAddress());
		System.out.println("Phone Number:\t" + this.getPhoneNumber());
		System.out.println("First Name:\t" + this.getFirstName());
		System.out.println("Last Name:\t" + this.getLastName());
	}

}
