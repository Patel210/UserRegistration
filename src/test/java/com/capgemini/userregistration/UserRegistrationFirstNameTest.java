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
	public void givenFirstName_WhenStartsWithCap_ShouldReturnTrue_HappyCase() {
		boolean result = userRegistration.validateFirstName("Tom");
		assertTrue(result);

	}

	@Test
	public void givenFirstName_WhenStartsWithlowerCase_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateFirstName("harry");
		assertFalse(result);

	}

	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateFirstName("Peter1a");
		assertFalse(result);

	}

	@Test
	public void givenFirstName_WhenContainsSpecialCharacters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateFirstName("Peter@a");
		assertFalse(result);

	}

	@Test
	public void givenFirstName_WhenContainsLessThan3Characters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateFirstName("Pe");
		assertFalse(result);

	}

}
