package com.capgemini.userregistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationPasswordTest {

	private UserRegistration userRegistration;

	@Before
	public void setup() {
		userRegistration = new UserRegistration();
	}

	/**
	 * To Check if the validate password is working properly
	 */
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue_HappyCase() {
		boolean result = userRegistration.validatePassword("Aqw9@1234");
		assertTrue(result);

	}

	@Test
	public void givenPassword_WhenNoDigitUsed_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePassword("Aqwa@asdf");
		assertFalse(result);

	}

	@Test
	public void givenPassword_WhenNoCapUsed_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePassword("9qwa@asdf");
		assertFalse(result);

	}

	@Test
	public void givenPassword_WhenNoSpecialCharacterUsed_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePassword("Aqwa9asdf");
		assertFalse(result);

	}

	@Test
	public void givenPassword_WhenLessThan8Characters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validatePassword("Aqwa@a5");
		assertFalse(result);

	}

}
