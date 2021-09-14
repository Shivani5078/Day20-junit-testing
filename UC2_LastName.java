package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  UC2_LastName {

	/**
	 * @param args
	 */

	public static boolean LastNameValidation(String lastName) { // declar the method

		boolean isLastName;
		String LastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(LastNameRegex);
		if (lastName == null) {
			isLastName = false;
		}
		Matcher matcher = pattern.matcher(lastName);
		isLastName = matcher.matches();
		

//check the condition
		if (isLastName)
			System.out.println(lastName + " is an Valid Last Name\n");
		else
			System.out.println(lastName + " is an Invalid Last Name");
	
		return matcher.matches();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastNameValidation("Pawar");// call the method
	}

}



