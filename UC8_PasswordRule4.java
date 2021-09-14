package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC8_PasswordRule4 {

	/**
	 * @param args
	 */
	public static String Rule4="Shivani@123";
	public static void Rule4Validation() { // declar the method

		boolean isRule4;
		String Rule4Regex ="^[A-Z]{1}[a-z]{5}[@][0-9]{1}";
		Pattern pattern = Pattern.compile(Rule4);
		if (Rule4 == null) {
			isRule4 = false;
		}
		Matcher matcher = pattern.matcher(Rule4);
		isRule4 = matcher.matches();
		

//check the condition
		if (isRule4)
			System.out.println(Rule4+ " is an Valid Rule4\n");
		else
			System.out.println(Rule4+ " is an Invalid Rule4");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rule4Validation();// call the method
	}

}



