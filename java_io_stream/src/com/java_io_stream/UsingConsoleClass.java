package com.java_io_stream;

import java.io.Console;

public class UsingConsoleClass {

	private static final Exception NullPointerException = null;

	// The Java Console class is be used to get input from console. It provides methods to read texts and passwords.
	// If you read password using Console class, it will not be displayed to the user.
	public static void main(String[] args) {
		try{
			Console c =  System.console();
		if(c == null) {
			throw NullPointerException ;
		}
		System.out.println("Enter your name : ");
		String text = c.readLine();
		System.out.println("Welcome " + text);
		
		System.out.println("Enter your password : ");
		char[] ch = c.readPassword();
		String pass = String.valueOf(ch);                  //converting char array into string  
		System.out.println("Password is: "+pass);
		
		
		}catch (Exception e) {
             e.printStackTrace();
		}
		System.out.println("Reading the text and password from console without displaying it to the user....");

	}

}
