package com.java8.newfeatures;


interface Phone{
	void call();
	default void message() {
		System.out.println("Message sent !!!");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		
		System.out.println("Calling!!!!");
		
	}
	
}

public class DefaultMethods {

	public static void main(String[] args) {
		
		Phone p = new AndroidPhone();
		p.call();
		p.message();

	}

}
