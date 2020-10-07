package com.capgemini.userregistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationFirstNameTest {

	private UserRegistration userRegistration;

	@Before
	public void setup() {
		userRegistration = new UserRegistration();
	}

	
	/**
	 * To Check if the validate First name is working properly
	 */
	@Test
	public void givenFirstName_WhenStartsWithCap_ShouldReturnTrue() {
		boolean result;
		try {
			result = userRegistration.validateFirstName("Tom");
			assertTrue(result);
		} catch (InvalidException e) {
			e.getMessage();
		}
		

	}

	@Test
	public void givenFirstName_WhenStartsWithlowerCase_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateFirstName("harry");
			assertTrue(result);
		} catch (InvalidException e) {
			e.getMessage();
		}
		

	}

	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateFirstName("Peter1a");
			assertTrue(result);
		} catch (InvalidException e) {
			e.getMessage();
		}
		

	}

	@Test
	public void givenFirstName_WhenContainsSpecialCharacters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateFirstName("Peter@a");
			assertTrue(result);
		} catch (InvalidException e) {
			e.getMessage();
		}
		

	}

	@Test
	public void givenFirstName_WhenContainsLessThan3Characters_ShouldThrowAnException() {
		boolean result;
		try {
			result = userRegistration.validateFirstName("Pe");
			assertTrue(result);
		} catch (InvalidException e) {
			e.getMessage();
		}

	}

}
