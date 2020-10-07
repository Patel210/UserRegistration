package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String REGEX_FIRST_NAME = "(^[A-Z][a-z]{2,}$)";
	private static final String REGEX_LAST_NAME = "(^[A-Z][a-z]{2,}$)";
	private static final String REGEX_EMAIL = "^[a-z0-9]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9]+\\.([a-z]{2,4})+((\\.[a-z]{2,4})?)$";
	private static final String REGEX_PHONE_NUMBER = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
	private static final String REGEX_PASSWORD = "[^\\s]{8,}";
	
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

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name to validate: ");
		userRegistration.validateFirstName(sc.next());
		System.out.println("Enter your last name to validate: ");
		userRegistration.validateLastName(sc.next());
		System.out.println("Enter your email to validate: ");
		userRegistration.validateEmail(sc.next());
		System.out.println("Enter your Phone Number in format:(91 9870987129) to validate: ");
		userRegistration.validatePhoneNumber(sc.next());
		System.out.println("Enter your Password to validate: ");
		userRegistration.validatePassword(sc.next());
		sc.close();
	}
}
