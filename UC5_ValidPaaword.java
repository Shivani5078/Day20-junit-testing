package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5_ValidPaaword {

	/**
	 * @param args
	 */
	
	public static boolean PasswordRule1Validation(String PasswordRule1) { // declar the method

		boolean isPasswordRule1;
		String PasswordRule1Regex ="^[A-Z]{1,}[a-z]{3,}@[0-9]{1,}$";
		Pattern pattern = Pattern.compile(PasswordRule1Regex);
		if (PasswordRule1 == null) {
			isPasswordRule1 = false;
		}
		Matcher matcher = pattern.matcher(PasswordRule1);
		isPasswordRule1 = matcher.matches();
		

//check the condition
		if (isPasswordRule1)
			System.out.println(PasswordRule1+ " is an Valid passwordRule1\n");
		else
			System.out.println(PasswordRule1+ " is an Invalid passwordRule1");
	
		return matcher.matches();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordRule1Validation("Shivani@134");// call the method
	}

}



