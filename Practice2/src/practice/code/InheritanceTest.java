package practice.code;

class A{
	static {
		System.out.println("A-Static Block");
	}
}
class B extends A{
	static {
		System.out.println("B-static Block");
	}
}

public class InheritanceTest {
   static {
	   System.out.println("Tester static block");
   }
	public static void main(String[] args) {
		A a=null;
		A a1=new A();
		B b=new B();

	}

}
