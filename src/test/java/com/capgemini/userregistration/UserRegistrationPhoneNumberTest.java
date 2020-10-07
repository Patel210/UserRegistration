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
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue_HappyCase() {
		boolean result = userRegistration.validatePhoneNumber("12 1234567890");
		assertTrue(result);

	}

	@Test
	public void givenPhoneNumber_WhenContainsCharacters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePhoneNumber("12 123a567890");
		assertFalse(result);

	}

	@Test
	public void givenPhoneNumber_WhenContainsSpecialCharacters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePhoneNumber("12 1234@567890");
		assertFalse(result);

	}

	@Test
	public void givenPhoneNumber_WhenLessThan10Digits_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePhoneNumber("12 123567890");
		assertFalse(result);

	}

}
