package MisselineousPattern;

public class ArrowPattern {
	public static void main(String[] args) {
   int i=0,j=0,k=0,z=1;
   int n=6,p=n-1,q=n-1;
   for(i=0;i<n;i++) {
	   for(j=p;j>i;j--) {
		   System.out.print(" ");
	   }
	   
	   for(k=0;k<z;k++) {
		   System.out.print("*");
	   }
	   z=z+2;
	   System.out.println();
   }
   
   for(int s=0;s<n;s++) {
	   for(int t=q;t>1;t--) {
		   System.out.print(" ");
	   }
	   for(int x=0;x<3;x++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
	}
	
}
