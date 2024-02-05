package Employee.Enum;

public class EmployeeTester {

	public static void main(String[] args) {
		Manager m1=new Manager("Joseph",101,50000,ManagerType.HR);
		m1.setSalary(50000);
		Manager m2=new Manager("Miller",102,60000,ManagerType.SALES);
		m2.setSalary(60000);
		System.out.println(m1);
		System.out.println(m2);
		
		Clerk c1=new Clerk(75,811,"Gopi",110,5000);
		c1.setSalary(5000);
		System.out.println(c1);
		c1.setSpeed(90);
		c1.setAccuracy(85);
		System.out.println(c1);

	}

}
