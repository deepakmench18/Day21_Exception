package com.bridgelab.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegisterationTest {
	
	@Test
	void testFirstNameValidation() {
		try
		{
		assertEquals(true,UserRegisteration.firstNameValidation("Dee"));
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	void testLastNameValidation() {
		try
		{
		assertEquals(true,UserRegisteration.lastNameValidation("Men"));
	}catch(CustomException e) {
		System.out.println(e.getMessage());
	}
	}

	@Test
	void testEmailValidation() {
		try
		{
		assertEquals(true,UserRegisteration.emailValidation("deepak@gmail.com"));
	}catch(CustomException e) {
		System.out.println(e.getMessage());
	}
	}

	@Test
	void testPhonenumberValidation() {
		try
		{
		assertEquals(true,UserRegisteration.phonenumberValidation("07038716093"));
	}catch(CustomException e) {
		System.out.println(e.getMessage());
	}
	}
	@Test
	void testPasswordValidation1() {
		try
		{
		assertEquals(true,UserRegisteration.passwordValidation1("Deepak12"));
	}catch(CustomException e) {
		System.out.println(e.getMessage());
	}
	}
	@Test
	void testPasswordValidation2() {
		try
		{
		assertEquals(true,UserRegisteration.passwordValidation2("DeepakM1"));
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	void testPasswordValidation3() {
		try
		{
		assertEquals(true,UserRegisteration.passwordValidation3("Deepak1@"));
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
