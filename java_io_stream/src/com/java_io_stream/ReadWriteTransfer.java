package com.java_io_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTransfer {

	public static void main(String[] args) throws IOException {
		File fin = new File("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
		File fo = new File("C:\\Users\\gaura\\OneDrive\\Desktop\\Copied.txt");
		
		FileReader fr = null ;
		FileWriter fw = null ;
		
		try {
			fr = new FileReader(fin);
			fw = new FileWriter(fo);
			
			int data ;
			while((data=fr.read())!= -1) {
				fw.write(data);
			}
			
			System.out.println("Transfer complete...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fr.close();
			fw.close();
		}

	}

}
