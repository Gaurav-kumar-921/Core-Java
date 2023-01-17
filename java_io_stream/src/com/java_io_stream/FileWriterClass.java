package com.java_io_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
	
	    

	public static void main(String[] args) throws IOException {
		
		File fo = new File("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
		FileWriter f2 = null;
		try {
			f2 = new FileWriter(fo);
			String s = "Now we are writing the data using FileWriter....";
//			byte b[] = s.getBytes();      
			f2.write(s);            // FileWriter me hume byte type array me convert nhi krna pdta
			System.out.println("Written using FileWriter....");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			f2.close();
		}
		

	}

}
