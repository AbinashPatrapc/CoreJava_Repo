package LogicalInterviewPOV;

//1- 1/2 + 1/3 - 1/4 + 1/5=0.7833333333333332
public class HarmonicNumber {
	public static void main(String[] args) {
		double sum=1;
		System.out.print("1");
        for(int i=2;i<=5;i++) {
        	if(i%2==0) {
        	System.out.print("-1\\"+i);
        	sum-=(1.0/i);
        	}
        	else {
        	System.out.print("+1\\"+i);	
        	sum+=(1.0/i);
        	}
        }
        System.out.println("="+sum);
	}
}
