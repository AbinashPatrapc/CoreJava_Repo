package practice.code;

public class ArraySortingTypes {
    public static void main(String[] args) {
		int arr[]={2,3,-1,10,0,-1,8,7,-1,9};
		
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp; 
				 }
				 
			 }			 
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==-1) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;  
				 }
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}
}
