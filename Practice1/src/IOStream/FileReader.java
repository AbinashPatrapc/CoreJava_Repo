package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("cbc.txt");
		FileOutputStream fos=new FileOutputStream("dbc.txt");
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		System.out.println("Data Saved");
	
		
		
	}

}
