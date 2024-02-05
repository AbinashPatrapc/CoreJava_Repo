
import java.io.Closeable;
import java.util.Scanner;

class Test implements Closeable{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
public class AutoClosableTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test t=new Test();
		Test t1=new Test();
		try(t;t1;sc){
			System.out.println(10);
		}catch(Exception e) {
			System.out.println("In catch");
			//e.printStackTrace();
		}
	}

}
