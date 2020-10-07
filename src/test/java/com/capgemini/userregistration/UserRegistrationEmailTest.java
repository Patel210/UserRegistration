package com.capgemini.userregistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationEmailTest {

	private UserRegistration userRegistration;

	@Before
	public void setup() {
		userRegistration = new UserRegistration();
	}

	/**
	 * To Check if the validate email is working properly
	 */
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue_HappyCase() {
		boolean result = userRegistration.validateEmail("abc.1ml+100t-100we.12wsd@gma1il.com.in");
		assertTrue(result);

	}

	@Test
	public void givenEmail_WhenProperSyntaxNotFollowedCase1_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateEmail("abc.@gmail.com");
		assertFalse(result);

	}

	@Test
	public void givenEmail_WhenProperSyntaxNotFollowedCase2_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateEmail("abc.@gmail.com");
		assertFalse(result);

	}

	@Test
	public void givenEmail_WhenProperSyntaxNotFollowedCase3_ShouldReturnFalse_SadCase() {
		boolean result = userRegistration.validateEmail("abc.ac@gmail.com.aa.ai");
		assertFalse(result);

	}

}
