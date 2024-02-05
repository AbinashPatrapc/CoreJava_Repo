package OnlineStudentRegd;

public class Course {
	private String courseName;
	private int availableSeat;

	public Course(String courseName, int availableSeat) {
		super();
		this.courseName = courseName;
		this.availableSeat = availableSeat;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	
	public  synchronized boolean registerStudent() {
		if(availableSeat==0)
			return false;
		else
			availableSeat--;
			return true;
	}

}
