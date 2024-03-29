package Employee.Enum;

public class Employee {
	private String name;
	private int empid;
	private double salary;

	public Employee() {
	}

	public Employee(String name, int empid, double salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
