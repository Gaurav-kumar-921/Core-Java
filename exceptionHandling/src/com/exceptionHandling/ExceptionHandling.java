 package com.exceptionHandling;

import java.util.Scanner;


class CustomException extends Exception{             // how to create custom exceptions
	
	public CustomException() {
	
		super("Age Invalid");
	}
	
	CustomException(String message){
		super(message);
	}
}



public class ExceptionHandling {
	
	Scanner sc = new Scanner(System.in);
	
	
	int num1 = sc.nextInt() ;
	int num2 = sc.nextInt();
	
	int res = num1/num2;
	
	
	public static void main(String[] args) {
		try {
			ExceptionHandling eh = new ExceptionHandling();
			System.out.println(eh.res);
			if(eh.num2 < 10) {
// jaanbuz kr jb koi programmer koi exception throw krna chahata hai to vo throw key use krke kr skte hai
				throw new CustomException("My Age is Invalid!!");         
			}
			
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("this block will always get executed");
		}
	}
	

}
