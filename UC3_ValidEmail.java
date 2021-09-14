package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3_ValidEmail {

	/**
	 * @param args
	 */

	public static boolean EmailidValidation(String Emailid) { // declar the method

		boolean isEmailid;
		String emailidRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(emailidRegex);
		
		if (Emailid == null) {
			isEmailid = false;
		}
		Matcher matcher = pattern.matcher(Emailid);
		isEmailid = matcher.matches();
		

//check the condition
		if (isEmailid)
			System.out.println(Emailid + " is an Valid Emailid\n");
		else
			System.out.println(Emailid+ " is an Invalid Emailid");
		return matcher.matches();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailidValidation("Shivani@123gmail.com");// call the method
	}

}



