import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest implements Serializable {
          int x;
          int y;
          SerializationTest(int x,int y){
        	  this.x=x;
        	  this.y=y;
          }
          
          public static void main(String[] args) throws Exception{
			SerializationTest s1=new SerializationTest(10,20);
			
			FileOutputStream fos=new FileOutputStream("abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			System.out.println("X: "+s1.x);
			System.out.println("Y: "+s1.y);
			oos.writeObject(s1);
			System.out.println("Serialized");
		}
} 


