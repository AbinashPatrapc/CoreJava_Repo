
public class SecondMaxElement {

	public static void main(String[] args) {
		int[] arr= {23,98,97,17,22,11,67,87};
		int max=arr[0];
		int max1=0;
		for(int i:arr) {
			if(i>max)
				max=i;
		}
		System.out.println("Max Element: "+max);
		for(int i:arr) {
		if(i>max1 && max!=i)
			max1=i;
		}
		System.out.println("Second Max Element: "+max1);
	}

}
