package com.java_io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// for writing anything into a file.
public class FileOutput {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fop = new FileOutputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
			byte b1[] = {'a','b','c','d'};
			fop.write(b1);
			String s = " this is how we write a string in the file";
			byte b2[] = s.getBytes();         // converting string into byte array 
			fop.write(b2);       // ASCII value ke form me pass hoti hai values
			System.out.println("Writing successfully!!!");
			fop.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
