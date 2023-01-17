package com.java_io_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingInputStreamReader {

	public static void main(String[] args) {
		
		// It connects input stream of keyboard
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			br.readLine();
			System.out.println("Data is typed from the keyboard....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
