package com.capgemini.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {

	private static final String REGEX_FIRST_NAME = "(^[A-Z][a-z]{2,}$)";
	private static final String REGEX_LAST_NAME = "(^[A-Z][a-z]{2,}$)";
	private static final String REGEX_EMAIL = "^[a-z0-9]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9]+\\.([a-z]{2,4})+((\\.[a-z]{2,4})?)$";
	private static final String REGEX_PHONE_NUMBER = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
	private static final String REGEX_PASSWORD = "^(?=.*[!@#$%^&*'<>-])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";
	

	/**
	 * To validate general entry
	 */
	public boolean validate(String pattern, String entry) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(entry);
		return m.find();
	}

	/**
	 * To validate first name
	 * @throws InvalidException
	 */
	public boolean validateFirstName(String firstName) throws InvalidException {
		if (validate(REGEX_FIRST_NAME, firstName)) {
			return true;
		} else {
			throw new InvalidException("Invalid First Name! Please, enter a valid First Name");
		}
	}
	
	/**
	 * To validate last name
	 * @throws InvalidException 
	 */
	public boolean validateLastName(String lastName) throws InvalidException {
		if (validate(REGEX_LAST_NAME, lastName)) {
			return true;
		} else {
			throw new InvalidException("Invalid Last Name! Please, enter a valid Last Name");
		}
	}

	/**
	 * To validate email
	 * @throws InvalidException 
	 */
	public boolean validateEmail(String email) throws InvalidException {
		if (validate(REGEX_EMAIL, email)) {
			return true;
		} else {
			throw new InvalidException("Invalid Email! Please, enter a valid Email");
		}
	}

	/**
	 * To validate phoneNumber
	 * @throws InvalidException 
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidException {
		if (validate(REGEX_PHONE_NUMBER, phoneNumber)) {
			return true;
		} else {
			throw new InvalidException("Invalid Phone Number! Please, enter a valid Phone Number");
		}
	}

	/**
	 * To validate password
	 * @throws InvalidException 
	 */
	public boolean validatePassword(String password) throws InvalidException {
		if (validate(REGEX_PASSWORD, password)) {
			return true;
		}
		else {
			throw new InvalidException("Invalid Password! Please, enter a valid Password");
		}
	}
}
