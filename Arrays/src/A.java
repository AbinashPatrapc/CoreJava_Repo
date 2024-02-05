
public class A {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				n1=n2;
				n2=n3;
				System.out.print(n3);
				n3=n1+n2;
			}
			n1=0;
			n2=1;
			n3=0;
			
			System.out.println();
		}

	}

}
