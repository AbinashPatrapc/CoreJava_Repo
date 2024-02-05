package MisselineousPattern;

public class Pattern_04 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=1;j<=n;j++) {
				System.out.print(x++);
			}
			System.out.println();
		}

	}

}
