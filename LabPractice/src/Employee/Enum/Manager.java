package Employee.Enum;

public class Manager extends Employee {
	private ManagerType type;

	public Manager() {
	}

	public Manager(String name, int eid, double salary, ManagerType type) {
		super(name, eid, salary);
		this.type = type;
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}
	

	
	@Override
	public String toString() {
		return "Manager details ::type=" + type + ", Type=" + getType() + ", Name=" + getName() + ", Empid="
				+ getEmpid() + ", Salary=" + getSalary();}

	@Override
	public void setSalary(double salary) {
		if (type == ManagerType.HR)
			super.setSalary((10000 + getSalary()));
		else if (type == ManagerType.SALES)
			super.setSalary((5000 + getSalary()));
		else
			System.out.println("Invalid ManagerType");
	}
}
