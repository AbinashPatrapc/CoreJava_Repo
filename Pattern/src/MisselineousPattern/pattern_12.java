package MisselineousPattern;

public class pattern_12 {

	public static void main(String[] args) {
		int n=4,k=0;
		for(int i=1;i<=n;i++)
		{
			k=k+i;
			for(int j=k;j>k-i;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}

	}

}
