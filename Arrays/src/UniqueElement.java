import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		int[] arr=new int[] {3,2,2,5,5,3,1};
		//int[] arr2=new int[20];
		int k=0;
		
		for(int i=0;i<4;i++) {
			int count=0;
			for(int j=0;j<4;j++) { //[3,2,2,5]
				if(arr[i]==arr[j]) {
					count++;
	
				}
				
			}
			if(count>1) {
				System.out.println(arr[i]);
				//break;
			}
		}
	}
}

