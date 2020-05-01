package testCaseSample;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExmpl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="FileOutPut.txt";
		String content="Hi Im FileOutPutStream";
		
		FileOutputStream fileoutstream = new FileOutputStream(location);
		byte[] contentBytes = content.getBytes();
		fileoutstream.write(contentBytes);
		fileoutstream.close();
	}
	

}
