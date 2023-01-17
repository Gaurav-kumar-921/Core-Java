package com.java_io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamClass {

	public static void main(String[] args) throws IOException {

		// Provides methods to write data to another stream 
		// Automatically flushes the data so no need to call the flush method.
			
			try {
				FileOutputStream fo = new FileOutputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
				PrintStream p1 = new PrintStream(fo);
				
				p1.println(400);
				p1.println("hyy my name is goku");
				System.out.println("data is successfully printed...");
				
				p1.close();
				fo.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	// Formatting using printf() method
	//		int i=5 ;
	//		System.out.printf("%d", i);
 
	}

}
