package com.java_io_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		File fin = new File("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");     // text file path 
		FileReader f1 = null;
		try {
			f1 = new FileReader(fin);
			int data ;
			while((data=f1.read())!= -1) {
				System.out.print((char)data);
			}
			System.out.println(" Reading using FileReader...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			f1.close();
		}
		

	}

}
