package MisselineousPattern;

public class A {
	
	
	public static String munberpar(int a) {
		String s="";
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1; j<=i;j++) {
				s+=(i*j)+" ";
			}
			s=s+"\n";
		}
		return s;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(munberpar(5));
		
			
		}
		
	}


