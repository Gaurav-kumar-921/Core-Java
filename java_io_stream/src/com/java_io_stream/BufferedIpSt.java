package com.java_io_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIpSt {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\goku.txt");
			BufferedInputStream b2 = new BufferedInputStream(fin);
			int all ;
			while((all=fin.read())!= -1) {
				System.out.print((char)all);
			}
			System.out.println(" Reading using bufferedInputStream...");
			b2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
