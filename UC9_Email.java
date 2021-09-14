package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC9_Email {
	/**
	 * @param args
	 */
	public static String Emailid="shivani732@gmail.com";
	public static void EmailidValidation( String email) { // declar the method

		boolean isEmailid;
		String emailidRegex ="^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$\";\r\n"
				+ "";
;
		Pattern pattern = Pattern.compile(Emailid);
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
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Valid Emails");
			
			String email = "abc@bridgelabz.co.in";
			EmailidValidation(email);
			
			email = "abc@gmail.com.com";
			EmailidValidation(email);
			
			email = "abc@yahoo.com";
			EmailidValidation(email);
			
			email = "abc@1.com";
			EmailidValidation(email);
			
			email = "abc-100@yahoo.com";
			EmailidValidation(email);
			
			email = "abc.100@yahoo.com";
			EmailidValidation(email);
			
			email = "abc111@abc.com";
			EmailidValidation(email);
			
			email = "abc-100@abc.net";
			EmailidValidation(email);
			
			email = "abc.100@abc.com.au";
			EmailidValidation(email);
			
			email = "abc+100@gmail.com";
			EmailidValidation(email);
			
			

			System.out.println("Invalid Emails");
			
			email = ".abc@abc.com";
			EmailidValidation(email);
			
			email = "abc";
			EmailidValidation(email);

			email = "abc@.com.my";
			EmailidValidation(email);

			email = "abc@abc@gmail.com";
			EmailidValidation(email);
			
			email = "abc()*@gmail.com";
			EmailidValidation(email);

			email = "abc..2002@gmail.com";
			EmailidValidation(email);

			email = "abc.@gmail.com";
			EmailidValidation(email);

			email = "abc123@.com";
			EmailidValidation(email);

			email = "abc123@.com.com";
			EmailidValidation(email);

			email = "abc123@gmail.a";
			EmailidValidation(email);

			email = "abc@%*.com";
			EmailidValidation(email);

			email = "abc@gmail.com.1a";
			EmailidValidation(email);

			email = "abc@gmail.com.aa.au";
			EmailidValidation(email);

			System.out.println("---------------------------------------------------");
		}
}




