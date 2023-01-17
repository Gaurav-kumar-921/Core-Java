package com.java_io_stream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOpStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream f1 = null;
		FileOutputStream f2 = null;
		try {
			f1 = new FileOutputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
			f2 = new FileOutputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\Copied.txt");
			
			ByteArrayOutputStream b1 = new ByteArrayOutputStream();
			String s = "data is written into byte array that can be written to multiple stream...";
			byte b[] = s.getBytes();
			b1.write(b);
			b1.writeTo(f1);        // write data into file 1
			b1.writeTo(f2);        // write data into file 2
			b1.flush();
			
			System.out.println("it is used to write data into multiple files...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			f1.close();
			f2.close();
		}
		
		
		
		

	}

}
