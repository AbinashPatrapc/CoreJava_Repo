import java.util.*;
class ArrayEvenOdd{
	public static void main(String[] args) {
		int c=0;
		int arr[]={2,3,6,8,12,14,27,28,13};
		int arr2[]=new int[arr.length];

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arr2[c]=arr[i];
			   c++;
			   }
		}
		
       System.out.println(Arrays.toString(arr2));
		for(int j=0;j<arr2.length;j++){
			if(arr[j]%2!=0){
				arr2[c]=arr[j];
			    c++;
				}
		}
       System.out.println("======================================");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
			
		}
	}
}