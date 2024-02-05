package OnlineStudentRegd;

public class OnlineStudentRegistrationSystem {

	public static void main(String[] args) {
		Course c1=new Course("Math", 5);
		Course c2=new Course("English", 5);
		Course c3=new Course("Science", 5);
		
		Student s1=new Student("Amit");
		Student s2=new Student("Gopi");
		Student s3=new Student("Hari");
		Student s4=new Student("Shyam");
		Student s5=new Student("Raj");
		s1.setCourse(c3);
		s2.setCourse(c1);
		s3.setCourse(c2);
		s4.setCourse(c1);
		s5.setCourse(c2);
		
		
		
		Thread t1=new Thread(()->s1.registerForCourse());
		t1.start();
		Thread t2=new Thread(()->s2.registerForCourse());
		t2.start();
		Thread t3=new Thread(()->s3.registerForCourse());
		t3.start();
		Thread t4=new Thread(()->s4.registerForCourse());
		t4.start();
		Thread t5=new Thread(()->s5.registerForCourse());
		t5.start();
		
		
	}

}
