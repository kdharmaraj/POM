package testCaseSample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		String location = "FileReader.txt";
		FileReader filereader=new FileReader(location);
		BufferedReader bufferread=new BufferedReader(filereader);
		
		String string;
		while ((string=bufferread.readLine())!=null) {
			System.out.println(string);
			
		}
		
		
		 
	}

}
