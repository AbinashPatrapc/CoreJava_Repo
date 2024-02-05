@FunctionalInterface
interface i1{
	void m1();
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		//i1 i=new i1() {public void m1(){System.out.println("Anonymous Inner Class");};
		i1 i=()->{System.out.println("Anonymous Inner Class");};
		i.m1();
		}
	}
