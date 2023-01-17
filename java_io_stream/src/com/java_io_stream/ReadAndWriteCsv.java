package com.java_io_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;


//for using OpenCSV we have to first follow either of the below step
	// OpenCSV is a CSV parser library for java.
	// 1. For maven project, you can include the OpenCSV maven dependency in pom.xml
	// file.
	// 2. You can Download OpenCSV Jar and include in your project class path.
	// 3. Download commons-lang3 Jar and include in your project class path.


public class ReadAndWriteCsv {

	private static final String CSV_FILE_PATH = "C:\\Users\\gaura\\OneDrive\\Desktop\\gokuRead.csv";

	public static void main(String[] args) {

//		System.out.println("Read data line by line with header \n");
//		readDataLineByLine(CSV_FILE_PATH);
//		System.out.println("====================================================================");
//
//		System.out.println("Reading all data at once \n");
//		readDataAllAtOnce(CSV_FILE_PATH);
//		System.out.println("====================================================================");

		
		System.out.println("Reading all data from a csv and write to another csv at once \n");
		readWriteCsvFile(CSV_FILE_PATH);
		System.out.println("====================================================================");
	}

	public static void readDataLineByLine(String file) {
		try {
			FileReader fr = new FileReader(file);
			CSVReader csvReader = new CSVReader(fr);

			String[] nextRecord;

			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
//			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readDataAllAtOnce(String file) {
		try {
			FileReader fr = new FileReader(file);
			CSVReader csvReader = new CSVReaderBuilder(fr).build();
	// CSVReader csvReader = new CSVReaderBuilder(fr).withSkipLines(1).build(); // for excluding a row
			List<String[]> allData = csvReader.readAll();

			for (String[] row : allData) {
				for (String cell : row) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void readWriteCsvFile(String file) {
		try {
			FileReader fr = new FileReader(file);
			CSVReader csvReader = new CSVReaderBuilder(fr).build();
	// CSVReader csvReader = new CSVReaderBuilder(fr).withSkipLines(1).build(); // for excluding a row
			List<String[]> allData = csvReader.readAll();
			
			FileWriter fw = new FileWriter("C:\\Users\\gaura\\OneDrive\\Desktop\\gokuWrite.csv");
			CSVWriter csvWriter = new CSVWriter(fw);

			for (String[] row : allData) {
				for (String cell : row) {
					System.out.print(cell + "\t");
					
				}
				System.out.println();
			}
			
		List<String[]> newSt = allData.stream().filter(x-> x.equals("pass")).collect(Collectors.toList());
	   		  System.out.println("Result is : ");
	   		  newSt.stream().forEach(e->{System.out.println(e);});
	   		  
	   		  
//			csvWriter.writeAll(allData);
//			csvWriter.flush();
//			System.out.println("data is written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
