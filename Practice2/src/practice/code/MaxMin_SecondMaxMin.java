package practice.code;

public class MaxMin_SecondMaxMin {

	public static void main(String[] args) {
		int[] arr={20,12,32,11,98,75};
		int max,min,smax,smin;
	    max=min=smax=smin=arr[0];
	    
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
			max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(smax<arr[i]&&arr[i]!=max) {
			smax=arr[i];
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(smin>arr[j]&&arr[j]!=min) {
				smin=arr[j];
			}
			
		}
		System.out.println("max:"+max+"\nSecond Max"+smax+"\nMin:"+min+"\nsecond min:"+smin);
   }

}
