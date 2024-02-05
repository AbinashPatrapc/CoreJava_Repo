package LogicalInterviewPOV;

public class IncrementOp {
	public static void main(String[] args) {
   int x=0,y=0;
   for(int i=0;i<5;i++) {
	   if((++x>3)&(++y>3)) {
		   x++;
	   }
   }
   System.out.println(x+" "+y);
	}
}
