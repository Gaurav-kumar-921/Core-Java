package com.java_io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//for Reading anything into a file.
public class FileInput {

	public static void main(String[] args) throws IOException {
		FileInputStream f = null ;
		try {
			f = new FileInputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
			int b = f.read();        // read() method returns ASCII value
			System.out.println((char)b);    // ASCII to char value
			
			// for reading all the characters from a file.
			int a = 0 ;
			while((a=f.read())!= -1) {      // -1 indicates end of file
				System.out.println((char)a);
			}
			System.out.println("Reading successfully!!!");
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		System.out.println("Simple message..");
//		System.err.println("Error message...");
	}
}
