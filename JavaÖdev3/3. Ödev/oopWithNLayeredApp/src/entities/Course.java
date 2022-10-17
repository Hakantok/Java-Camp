package entities;

public class Course {
	
	private String courseName;
	private String teacherName;
	private double coursePrice;
	
	public Course(String courseName, String teacherName, double coursePrice) {
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
}
