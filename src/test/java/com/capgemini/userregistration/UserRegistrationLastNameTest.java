package com.capgemini.userregistration;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationLastNameTest {

	private UserRegistration userRegistration;

	@Before
	public void setup() {
		userRegistration = new UserRegistration();
	}

	/**
	 * To Check if the validate Last name is working properly
	 */
	@Test
	public void givenLastName_WhenStartsWithCap_ShouldReturnTrue() {
		boolean result;
		try {
			result = userRegistration.validateLastName("Clarke");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WhenStartsWithlowerCase_ShouldThrowAnException() {
		boolean result = false;
		try {
			result = userRegistration.validateLastName("clarke");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
			
		}

	}

	@Test
	public void givenLastName_WhenContainsSpecialCharacters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateLastName("Clark@e");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WhenContainsNumbers_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateLastName("Clark9e");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WhenContainsLessThan3Characters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateLastName("Oz");
			assertTrue(result);
		} catch (InvalidException e) {
			e.printStackTrace();
		}

	}

}
