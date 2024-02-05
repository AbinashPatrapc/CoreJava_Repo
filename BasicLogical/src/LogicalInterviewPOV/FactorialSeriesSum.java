package LogicalInterviewPOV;

public class FactorialSeriesSum {

	public static void main(String[] args) {
		float sum=1;
		int fact=1;
		System.out.print("1");
	   for(int i=2;i<=5;i++) {
		   System.out.print("+ 1\\"+i);
		   fact=1;
		   for(int j=i;j>=1;j--) {
			   fact=fact*j;
		   }
		   sum+=(1.0/fact);
	   }
	   System.out.println("="+sum);

	}

}
