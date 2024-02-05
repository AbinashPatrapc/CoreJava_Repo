import java.util.Arrays;

public class Merging2ArrayandDuplicateRemove {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,2,5,8};
		int[] arr2= {10,9,8,11,13,5};
		int[] arr3=new int[arr1.length+arr2.length];
		int c=0,count=1;
		for(int i=0;i<arr1.length;i++) {
			arr3[c]=arr1[i];
			c++;
		}
		System.out.println("Size"+c);
		for(int i=0;i<arr2.length;i++) {
			arr3[c]=arr2[i];
			c++;
		}
		System.out.println(Arrays.toString(arr3));
		for(int i=0;i<arr3.length;i++) {
			count=1;
			for(int j=i+1;j<arr3.length;j++) {
				if(arr3[i]==arr3[j]) {
				    arr3[j]=888;
				}
			}
		}
    for(int i=0;i<arr3.length;i++) {
    	if(arr3[i]!=888) {
    		System.out.print(arr3[i]+" ");
    	}
    }

	}

}
