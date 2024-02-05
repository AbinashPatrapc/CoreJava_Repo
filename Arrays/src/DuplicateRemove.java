
public class DuplicateRemove {

	public static void main(String[] args) {
		int[] arr=new int[] {11,15,11,12,23,19,15,11,12,23,23,12,11,15};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
				
			}	
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!= -1) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
