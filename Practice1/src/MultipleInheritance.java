class test {
	void m1() {}
	
}

class MultipleInheritance extends test {
	public static void main(String[] args) {
		MultipleInheritance i=new MultipleInheritance() {
			void m1() {System.out.printf("Hello");}
		};
		i.m1();
	}
}

