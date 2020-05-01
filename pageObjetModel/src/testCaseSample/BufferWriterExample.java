package testCaseSample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="Buffer.txt";
		String content="Hi Im BufferedWriter";
		
		FileWriter filewriter= new FileWriter(location);
		BufferedWriter buffer=new BufferedWriter(filewriter);
		buffer.write(content);
		buffer.close();
	}

}
