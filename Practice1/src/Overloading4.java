
class C {
	void m1(String s) {
		System.out.println("C string args(super)");
	}

	void m1(Integer i) {
		System.out.println("C integer args(super)");
	}
}

class D extends C {

	void m1(Object o) {
		System.out.println("D object args(sub)");
	}

	void m1(String s,int s1) {
		System.out.println("D.. string args(sub)");
	}

	void m1(Integer i) {
		System.out.println("D integer args(sub)");
	}

}

public class Overloading4 {

	public static void main(String[] args) {

		D b = new D();
		b.m1("a");
		b.m1(10);
	
		
		System.out.println();
		
		C c = new D();
		
		c.m1("a");
		c.m1(10);
		
		
		
	}

}