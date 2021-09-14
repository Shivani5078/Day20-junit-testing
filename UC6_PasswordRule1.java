package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC6_PasswordRule1 {


	/**
	 * @param args
	 */
	public static String PasswordRule1=" Shivani@123 s";
	public static void PasswordRule1Validation() { // declar the method

		boolean isPasswordRule1;
		String PasswordRule1Regex ="^[a-z]{8,}$";
		Pattern pattern = Pattern.compile(PasswordRule1);
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
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordRule1Validation();// call the method
	}

}



