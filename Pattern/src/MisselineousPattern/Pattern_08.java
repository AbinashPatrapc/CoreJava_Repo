package MisselineousPattern;

public class Pattern_08 {

	public static void main(String[] args) {
		int n=5;int x=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i%2==1)
					System.out.print(x++ +" ");
				else
					System.out.print(--x +" ");
			}
			x=x+n;
			System.out.println();
			
		}

	} 

}
