
public class ArrayTricky {
	
	 void m1() {
		int x='a'-'A'-new int[] {10,20,30}[2]+8;// 97-65-30+8=10
		int y='a'-'A'-new int[] {10,20,30}[1]+8;//97-65-20+8=20
		int z=(x>y)? (x++ + ++x):(y-- - --y);//20-18=2
		System.out.println(z);
	}
	public static void main(String[] args) {
		ArrayTricky t= new ArrayTricky();
		t.m1();
		
	}

}
