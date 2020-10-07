package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * To validate first name
	 */
	public void validateFirstName(String firstName) {
		if (validateName(firstName)) {
			System.out.println("First Name is Valid");
		} else {
			System.out.println("Invalid First Name!");
		}

	}

	/**
	 * To validate general name
	 */
	public boolean validateName(String name) {
		String regex = "(^[A-Z][a-z]{2,}$)";
		Pattern r = Pattern.compile(regex);
		Matcher m = r.matcher(name);
		return m.find();
	}

	/**
	 * To validate last name
	 */
	public void validateLastName(String lastName) {
		if (validateName(lastName)) {
			System.out.println("Last Name is Valid");
		} else {
			System.out.println("Invalid Last Name! Try again!");
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name to validate: ");
		userRegistration.validateFirstName(sc.next());
		System.out.println("Enter your last name to validate: ");
		userRegistration.validateLastName(sc.next());
		sc.close();
	}
}
