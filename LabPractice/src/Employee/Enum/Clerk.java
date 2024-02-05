package Employee.Enum;

public class Clerk extends Employee {
	int speed;
	int accuracy;

	
	public Clerk() {}
	
	public Clerk(int speed, int accuracy,String name, int empid, double salary) {
		super(name,empid,salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	public void setSalary(double salary) {
		if(speed>70 && accuracy>80)
			super.setSalary((1000+getSalary()));
		else 
			super.setSalary(salary);
	}

	@Override
	public String toString() {
		return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", Salary=" + getSalary() ;
	}

	
}
