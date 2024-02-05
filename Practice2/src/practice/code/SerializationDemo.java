package practice.code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
   public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student s1=new Student(101,"Abinash","Hyderabad",80);
	//Serialization
	FileOutputStream file=new FileOutputStream("D:\\SerializableFile.txt");
	ObjectOutputStream obj=new ObjectOutputStream(file);
	obj.writeObject(s1);
	System.out.println("Serialization Completed");
    //DeSerialization
	Student s2=null;
	FileInputStream file2=new FileInputStream("D:\\SerializableFile.txt");
	ObjectInputStream obj2=new ObjectInputStream(file2);
	s2=(Student)obj2.readObject();
	System.out.println(s2);
   
   }	
}
