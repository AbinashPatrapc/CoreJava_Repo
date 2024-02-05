
public class Student {
	@Override
     public void finalize() {
		System.out.println("Finalize called in Student");
	}
	
//	static int a=5;
//	int x=10;
//	
//	void  m1() {
//		int a=50;
//		int x=30;
//		System.out.println(Student.a);	
//		System.out.println(this.a);
//		
//		System.out.println(this.x);
//		System.out.println(x);
//		}
//	public static void main(String[] args) {
//		Student s1=new Student();
//		s1.m1();
//	}
     
}
