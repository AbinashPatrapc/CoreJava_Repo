package LogicalInterviewPOV;

//1+11+111+1111+11111=12345
public class SumOfSeries {
	public static void main(String[] args) {
		int s = 0, t = 1,sum=0;
		
		for(int i=1;i<=5;i++) {
			s=s*10+t;
			if(i==5)
				System.out.print(s+"=");
			else
			System.out.print(s+"+");
	        sum+=s;
		}
		System.out.println(sum);
	}
}
