package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC7PasswordRule2 {

	/**
	 * @param args
	 */
	public static String Rule2="Shivani@123";
	public static void Rule2Validation() { // declar the method

		boolean isRule2;
		String Rule2Regex ="^[A-Z]$";
		Pattern pattern = Pattern.compile(Rule2);
		if (Rule2 == null) {
			isRule2 = false;
		}
		Matcher matcher = pattern.matcher(Rule2);
		isRule2 = matcher.matches();
		

//check the condition
		if (isRule2)
			System.out.println(Rule2+ " is an Valid Rule2\n");
		else
			System.out.println(Rule2+ " is an Invalid Rule2");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rule2Validation();// call the method
	}

}



