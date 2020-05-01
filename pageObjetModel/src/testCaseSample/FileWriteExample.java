package testCaseSample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="filewriter.txt";
		String content ="This is Sample";
		
		FileWriter filewrite = new FileWriter(location);
		filewrite.write(content);
		filewrite.close();
	}

}
