//Finding Second Largest element in array without
//sorting the array
public class SecondMaxElementArray {
	public static void main(String[] args) {
         int arr[]= {19,4,7,24,29,2,6,18};
         int max=arr[0];
         
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]>max)
        		 max=arr[i]; 
         }
         System.out.println("Max Element:"+max);
        int max1=0;
        for(int i=0;i<arr.length;i++) {
             if(arr[i]>max1 && max!=arr[i])
            	 max1=arr[i];
        }
        System.out.println("Second Max Element:"+max1);
	}
}
