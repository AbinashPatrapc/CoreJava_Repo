package Helena;

public class Constructor {

	int a;
	int b;
	
	public Constructor(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	
	public static void main(String[] args) {
		Constructor cc=new Constructor(10,20);
		System.out.println(cc.a+" "+cc.b);

	}

}
