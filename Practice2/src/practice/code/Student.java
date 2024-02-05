package practice.code;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	String addrs;
	int avg;
	public Student(int id, String name, String addrs, int avg) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addrs=" + addrs + ", avg=" + avg + "]";
	}
	
	
}
