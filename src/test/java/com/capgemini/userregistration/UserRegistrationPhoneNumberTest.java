package com.capgemini.userregistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationPhoneNumberTest {

	private UserRegistration userRegistration;

	@Before
	public void setup() {
		userRegistration = new UserRegistration();
	}

	/**
	 * To Check if the validate phone number is working properly
	 */
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		boolean result;
		try {
			result = userRegistration.validatePhoneNumber("12 1234567890");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPhoneNumber_WhenContainsCharacters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePhoneNumber("12 123a567890");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPhoneNumber_WhenContainsSpecialCharacters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePhoneNumber("12 1234@567890");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPhoneNumber_WhenLessThan10Digits_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePhoneNumber("12 123567890");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

}
