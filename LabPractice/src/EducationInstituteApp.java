//Course class representing a course offered by the education institute
class Course {

	int id;
	String name;
	double fee;

	public Course(int id, String name, double fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFee() {
		return fee;
	}
}

//Offer class representing a special offer provided by the education institute
class Offer {

	String offerText;

	public Offer(String offerText) {
		this.offerText = offerText;
	}

	public String getOfferText() {
		return offerText;
	}

}

//EducationInstitute class managing courses, offers, and student enrollment
class EducationInstitute {
	Course[] courses;
	Offer[] offers;

	public EducationInstitute(Course[] courses, Offer[] offers) {
		this.courses = courses;
		this.offers = offers;

	}

	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}

	public void enrollStudentInCourse(int courseId, String studentName) {
		System.out.println("Student Enrolled With Course Id" + courseId);
		System.out.println("Stude name:" + studentName);

	}
}

//Student class representing a student who interacts with the education institute
class Student extends Thread {
	String name;
	EducationInstitute institute;

	public Student(String name, EducationInstitute institute) {
		this.name = name;
		this.institute = institute;
	}

	public void viewCoursesAndFees() {
		Course[] courses = institute.getCourses();
		System.out.println("\nAvailable Courses:");
		for (Course course : courses) {
			System.out.println(course.getId() + ". " + course.getName() + " - Fee: Rs." + course.getFee());
		}

	}

	public void viewOffers() {
		Offer[] offers = institute.getOffers();
		System.out.println("\nOngoing Offers:");
		for (Offer offer : offers) {
			System.out.println(offer.getOfferText());
		}

	}

	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}

	public void run() {
		viewCoursesAndFees();
		viewOffers();

		// Randomly choose a course and enroll the student
		Course[] courses = institute.getCourses();
		int randomCourseIndex = (int) (Math.random() * courses.length);
		enrollInCourse(courses[randomCourseIndex].getId());
	}

}

//EducationInstituteApp class as the main program
public class EducationInstituteApp {
	public static void main(String[] args) throws InterruptedException {
		EducationInstitute institute = new EducationInstitute(
				new Course[] { new Course(1, "Mathematics", 1000.0), new Course(2, "Science", 1200.0),
						new Course(3, "English", 900.0) },
				new Offer[] { new Offer("Special discount: Get 20% off on all courses!"),
						new Offer("Limited time offer: Enroll in any two courses and get one course free!") });
		Student john = new Student("John", institute);
		Student alice = new Student("Alice", institute);

		john.start();
		alice.start();
	}
}