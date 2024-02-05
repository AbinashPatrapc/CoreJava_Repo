
public class OccuranceOfElement {

	public static void main(String[] args) {
		int arr[]= {2,3,-1,2,4,6,3,-8,6,4,1,3,5};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				}
		}
		for(int i=0;i<arr.length;i++) {
			int c=1;	
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
					arr[j]=max+1;
				}
			}
			if(arr[i]!=max+1)
			System.out.println(arr[i]+" "+c);
		}

	}

}// 
