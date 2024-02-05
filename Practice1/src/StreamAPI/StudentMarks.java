package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private String name;
	private String addrs;
	private String subject;
	int marks;

	public Student(String name, String addrs, String subject, int marks) {
		this.name = name;
		this.addrs = addrs;
		this.subject = subject;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addrs=" + addrs + ", subject=" + subject + ", marks=" + marks + "]";
	}

}

public class StudentMarks {
	public static void main(String[] args) {

		List<Student> studlist = new ArrayList<>();
		studlist.add(new Student("Gopal", "Hyd", "English", 21));
		studlist.add(new Student("Hari", "Odisha", "English", 31));
		studlist.add(new Student("Madhu", "kerala", "English", 19));
		studlist.add(new Student("Shyam", "Himachal", "English", 35));
		studlist.add(new Student("Yadav", "UP", "English", 78));
		studlist.add(new Student("Madhuri", "MP", "English", 12));
		studlist.add(new Student("Jadu", "Gujrat", "English", 9));
		studlist.add(new Student("Santosh", "Goa", "English", 78));
		studlist.add(new Student("Anurag", "Mumbai", "English", 95));

		studlist.forEach(student -> {
			if (student.getMarks() < 30) {
				student.setMarks(student.getMarks() + (30 - student.getMarks()));
			}
		});
		for (Student stud : studlist)

			System.out.println(stud);
	}

}
