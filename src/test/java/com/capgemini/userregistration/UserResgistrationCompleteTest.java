package com.capgemini.userregistration;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UserRegistrationFirstNameTest.class, UserRegistrationLastNameTest.class,
		UserRegistrationEmailTest.class, UserRegistrationPhoneNumberTest.class, UserRegistrationPasswordTest.class })
public class UserResgistrationCompleteTest {

}
