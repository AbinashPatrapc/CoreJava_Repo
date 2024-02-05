
public class ArmstrongNumber {

	public static void main(String[] args) {
		int a=0,b=1,c=0,n=5;
	        for(int i=0;i<7;i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}

}
