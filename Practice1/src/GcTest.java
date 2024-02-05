
public class GcTest {

	@Override
    public void finalize() {
		System.out.println("Finalize called in GcTest");
	}
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2="Hello";
		System.out.println(s1.equals(s2));
		
		GcTest t= new GcTest();
		Student s=new Student();
		s=null;
		s1=null;
		t=null;
		System.gc();
	//Finalize method is not execute for pre defined
	//unreferenced object
		
		
	 
	}

}
