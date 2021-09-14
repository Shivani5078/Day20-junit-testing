package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1_FristNameValidation {


	/**
	 * @param args
	 */

	public static boolean FirstNameValidation( String firstName) { // declar the method

		boolean isFirstName;
		String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(firstNameRegex);
		if (firstName == null) {
			isFirstName = false;
		}
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();
		

//check the condition
		if (isFirstName)
			System.out.println(firstName + " is an Valid First Name\n");
		else
			System.out.println(firstName + " is an Invalid First Name");
	return matcher.matches();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNameValidation("Shivani");// call the method
	}

}


