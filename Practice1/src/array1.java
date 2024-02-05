
public class array1 {
	public static void main(String[] args) {
		int c=0,temp=0;
		int arr[]={0,5,-1,0,33,0,0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;}
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;}
			}
			
		}

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
	}
}
