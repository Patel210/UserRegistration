package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * To validate first name
	 */
	public void validateFirstName(String firstName) {

		String regex = "(^[A-Z][a-z]{2,})";
		Pattern r = Pattern.compile(regex);
		Matcher m = r.matcher(firstName);
		if (m.find()) {
			System.out.println("First Name is Valid");
		} else {
			System.out.println("Invalid First Name!");
		}

	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name to validate: ");
		userRegistration.validateFirstName(sc.next());
		sc.close();
	}
}
