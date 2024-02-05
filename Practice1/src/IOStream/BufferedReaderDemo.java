package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws FileNotFoundException ,IOException{
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("bbc.txt"));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line+"\n");
		}
		//bw.write(br.readLine());
		//bw.write(br.readLine());
		System.out.println("Data Saved Successfully");
		br.close();
		bw.close();
	}

}
