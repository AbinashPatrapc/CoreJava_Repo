package OnlineStudentRegd;

public class Student {  //implements Runnable
	private String studentName;
	private Course course;

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void registerForCourse() {
		
		synchronized (course) {
            if (course.registerStudent()) {
                System.out.println(studentName + " successfully registered for " + course.getCourseName() + " course.");
            } else {
                System.out.println(studentName + " could not register for " + course.getCourseName() + " course.");
            }
        }
	}

//	@Override
//	public void run() {
//		registerForCourse();
//		
//	}

}
