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
	public void givenLastName_WhenStartsWithCap_ShouldReturnTrue_HappyCase() {
		boolean result = userRegistration.validateLastName("Clarke");
		assertTrue(result);

	}

	@Test
	public void givenLastName_WhenStartsWithlowerCase_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateLastName("clarke");
		assertFalse(result);

	}

	@Test
	public void givenLastName_WhenContainsSpecialCharacters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateLastName("Clark@e");
		assertFalse(result);

	}

	@Test
	public void givenLastName_WhenContainsNumbers_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateLastName("Clark9e");
		assertFalse(result);

	}

	@Test
	public void givenLastName_WhenContainsLessThan3Characters_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateLastName("Oz");
		assertFalse(result);

	}

}
