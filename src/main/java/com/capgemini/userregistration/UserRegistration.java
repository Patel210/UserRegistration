package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String REGEX_FIRST_NAME = "(^[A-Z][a-z]{2,}$)";
	private static final String REGEX_LAST_NAME = "(^[A-Z][a-z]{2,}$)";
	private static final String REGEX_EMAIL = "^[a-z0-9]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9]+\\.([a-z]{2,4})+((\\.[a-z]{2,4})?)$";
	private static final String REGEX_PHONE_NUMBER = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
	private static final String REGEX_PASSWORD = "^(?=.*[!@#$%^&*'<>-])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";
	
	/**
	 * To validate first name
	 */
	public void validateFirstName(String firstName) {
		if (validate(REGEX_FIRST_NAME, firstName)) {
			System.out.println("First Name is Valid");
		} else {
			System.out.println("Invalid First Name!");
		}
	}

	/**
	 * To validate general entry
	 */
	public boolean validate(String pattern, String entry) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(entry);
		return m.find();
	}

	/**
	 * To validate last name
	 */
	public void validateLastName(String lastName) {
		if (validate(REGEX_LAST_NAME, lastName)) {
			System.out.println("Last Name is Valid");
		} else {
			System.out.println("Invalid Last Name! Try again!");
		}
	}

	/**
	 * To validate email
	 */
	public void validateEmail(String email) {
		if (validate(REGEX_EMAIL, email)) {
			System.out.println("Email is Valid");
		} else {
			System.out.println("Invalid Email! Try again!");
		}
	}

	/**
	 * To validate phoneNumber
	 */
	public void validatePhoneNumber(String phoneNumber) {
		if (validate(REGEX_PHONE_NUMBER, phoneNumber)) {
			System.out.println("Phone Number is Valid");
		} else {
			System.out.println("Phone Number is invalid! Try again!");
		}
	}

	/**
	 * To validate password
	 */
	public void validatePassword(String password) {
		if (validate(REGEX_PASSWORD, password)) {
			System.out.println("Password is Valid");
		}

		else {
			System.out.println("Password is invalid! Try again!");
		}

	}

	/**
	 * Clearing all sample emails additionally provided
	 */
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		{
		userRegistration.validateEmail("abc@yahoo.com");
		userRegistration.validateEmail("abc-100@yahoo.com");
		userRegistration.validateEmail("abc.100@yahoo.com");
		userRegistration.validateEmail("abc111@abc.com");
		userRegistration.validateEmail("abc-100@abc.net");
		userRegistration.validateEmail("abc.100@abc.com.au");
		userRegistration.validateEmail("abc@1.com");
		userRegistration.validateEmail("abc@gmail.com.com");
		userRegistration.validateEmail("abc+100@gmail.com");
		userRegistration.validateEmail("abc");
		userRegistration.validateEmail("abc@.com.my");
		userRegistration.validateEmail("abc123@gmail.a");
		userRegistration.validateEmail("abc123@.com");
		userRegistration.validateEmail("abc123@.com.com");
		userRegistration.validateEmail(".abc@abc.com");
		userRegistration.validateEmail("abc()*@gmail.com");
		userRegistration.validateEmail("abc@%*.com");
		userRegistration.validateEmail("abc..2002@gmail.com");
		userRegistration.validateEmail("abc.@gmail.com");
		userRegistration.validateEmail("abc@abc@gmail.com");
		userRegistration.validateEmail("abc@gmail.com.1a");
		userRegistration.validateEmail("abc@gmail.com.aa.au");
		}
	}
}
