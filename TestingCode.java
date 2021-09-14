package com.javaRegex;

import org.junit.Assert;
import org.junit.Test;

public class TestingCode {

	//Test case for the fristname
	@Test
	public void First_Letter_Capital_ReturnTrue() {
		Assert.assertTrue(UC1_FristNameValidation.FirstNameValidation("Shivani"));
		
	}
	@Test
	public void Frist_Letter_Number_ReturnFalse() {
		Assert.assertFalse(UC1_FristNameValidation.FirstNameValidation("7hivani"));
	}
	@Test
	public void Frist_Letter_symbol_ReturnFalse() {
		Assert.assertFalse(UC1_FristNameValidation.FirstNameValidation("@Shivani"));
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void FirstLetterCapital_ReturnTrue() {
		Assert.assertTrue(UC2_LastName.LastNameValidation("Pawar"));	
	}
	@Test
	public void FristLetterNumberReturnFalse() {
		Assert.assertFalse(UC2_LastName.LastNameValidation("7awar"));	
	}
	@Test
	public void FristLettersymbolReturnFalse() {
		Assert.assertFalse(UC2_LastName.LastNameValidation("@pawar"));
}
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void Frist_LetterCapital_ReturnTrue() {
		Assert.assertTrue(UC3_ValidEmail.EmailidValidation("Shivani@123gmail.com"));
	}
	@Test
	public void when_Dot_isabesent_ReturnFalse() {
		Assert.assertFalse(UC3_ValidEmail.EmailidValidation("Shivani123"));
	}
	@Test
	public void When_AtTheRate_absent_ReturnFalse() {
	
        Assert.assertFalse(UC3_ValidEmail.EmailidValidation("Shivani123gmail.com"));
	}

	@Test
	public void When_FirstLetterSymbol_ReturnFalse() {
	
        Assert.assertFalse(UC3_ValidEmail.EmailidValidation("@pawar"));
	}
	//////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void When_Characture_present_ReturnFalse()
	{
        Assert.assertFalse(UC4_ValidMobileNumber.MobilenoValidation("b9552a"));
	}	

	@Test
	public void When_Number_present_ReturnTrue()
	{
        Assert.assertTrue(UC4_ValidMobileNumber.MobilenoValidation("91 9552639142"));
        
	}
	@Test 
	public void Ten_digit_Number_Absent_ReturnFalse()
	{
        Assert.assertFalse(UC4_ValidMobileNumber.MobilenoValidation("91 95526392" ));
	}
	
	///////////////////////////////////////////////////////////////////////////
     @Test
	public void When_password_present_ReturnTrue()
	{
    	 Assert.assertTrue(UC5_ValidPaaword.PasswordRule1Validation("Shivani@123"));
	}

     @Test
 	public void in_password_Number_AreAbsent_ReturnFalse()
 	{
 		Assert.assertFalse(UC5_ValidPaaword.PasswordRule1Validation("Abhijeet@"));
 }
     
}
