
public class WHileLoop {

	public static void main(String[] args) {
		int num = 223, rem, sum = 0;
		
		while (num != 0) {
			
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		
		System.out.println(sum);
	}

}
