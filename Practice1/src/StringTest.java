
public class StringTest {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Welcome";
		System.out.println("1 "+s1.hashCode());
		
		s1=(s1+s2);
		System.out.println("2 "+s1.hashCode());
		
		s1=s1.concat(s2);
		System.out.println("3 "+s1.hashCode());
	}

}
