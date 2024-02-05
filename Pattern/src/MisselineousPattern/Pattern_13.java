package MisselineousPattern;

public class Pattern_13 {

	public static void main(String[] args) {
		int n=5, k=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int z=i-1;z>=1;z--) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
	}

}//16 =7+9 
