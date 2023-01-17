package com.java_io_stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


// it is used internal buffer to store data and it is more fast and more efficient.
public class BufferedOpSt {

	public static void main(String[] args) {
		FileOutputStream fop;
		try {
			fop = new FileOutputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
			BufferedOutputStream b1 = new BufferedOutputStream(fop);
			String s = "now we are writing in the text file by using BufferedOutputStream";
			byte b[] = s.getBytes();
			b1.write(b);
			System.out.println("Written using Buffered successfully!!");
			
			b1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
