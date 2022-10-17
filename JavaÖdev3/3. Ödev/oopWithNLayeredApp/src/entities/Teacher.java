package entities;

public class Teacher {
	
	Course course;
	private String teacherName;
	
	public Teacher(Course course, String teacherName) {
		this.course = course;
		this.teacherName = teacherName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
}
