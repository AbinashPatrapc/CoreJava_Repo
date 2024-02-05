
public class MergingArray {

	public static void main(String[] args) {
		int c=0;
		int[] arr= {10,20,30};
		int[] arr1= {40,50,60,70};
		int[] arr2=new int[arr.length+arr1.length];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
			c++;
		}
		
		for(int i=0;i<arr1.length;i++) {
			arr2[c]=arr1[i];
			c++;
		}
		
        for(int i=0;i<c;i++) {
           System.out.print(arr2[i]+" ");	
        
        }
		
		
	}

}
