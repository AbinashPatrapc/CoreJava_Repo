
public class MaxMinElement {

	public static void main(String[] args) {
		int[] arr= {4,5,7,21,34,89,34,2,56,67};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}	
			}	
		}
		System.out.println("Min Element is: "+arr[0]);
		System.out.println("Max Element is: "+arr[arr.length-1]);
		System.out.println("2nd Max Element is: "+arr[arr.length-2]);
		
		
		
	}

}
