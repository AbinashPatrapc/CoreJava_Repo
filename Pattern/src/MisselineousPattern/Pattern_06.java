package MisselineousPattern;

public class Pattern_06 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=1;j<=n;j++) {
				System.out.print(x+" ");
				x=x+i;
			}
			System.out.println();
		}
	}
}
