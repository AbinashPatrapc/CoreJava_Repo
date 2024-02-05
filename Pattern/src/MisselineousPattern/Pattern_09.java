package MisselineousPattern;

public class Pattern_09 {

	public static void main(String[] args) {
	  int n=5;
	  for(int i=1;i<=n;i++) { 
		  
		 int x=i; int y=(n-i)+1;
		 
		  for(int j=1;j<=n;j++) {
			  
			  if(j%2==1)
			  System.out.print(x+" ");
			  else
			  System.out.print(y+" "); 
			  
			  x=x+n;
			  y=x+n;
				  
			  }
		  System.out.println();
			  
		  }
		  
	  }

	}


