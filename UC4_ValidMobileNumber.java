package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4_ValidMobileNumber {


	/**
	 * @param args
	 */
	
	public static boolean MobilenoValidation(String Mobileno) { // declar the method

		boolean isMobileno;
		String MobilenoRegex ="^[0-9]{2}\\s{1}[0-9]{10}$" ;
		Pattern pattern = Pattern.compile(MobilenoRegex);
		if (Mobileno == null) {
			isMobileno = false;
		}
		Matcher matcher = pattern.matcher(Mobileno);
		isMobileno = matcher.matches();
		

//check the condition
		if (isMobileno)
			System.out.println(Mobileno + " is an Valid Mobileno\n");
		else
			System.out.println(Mobileno+ " is an Invalid mobileno");
		return matcher.matches();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilenoValidation("9552639243");// call the method
	}

}



