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
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		boolean result;
		try {
			result = userRegistration.validatePassword("Aqw9@1234");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPassword_WhenNoDigitUsed_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePassword("Aqwa@asdf");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPassword_WhenNoCapUsed_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePassword("9qwa@asdf");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPassword_WhenNoSpecialCharacterUsed_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePassword("Aqwa9asdf");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void givenPassword_WhenLessThan8Characters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validatePassword("Aqwa@a5");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		

	}

}
