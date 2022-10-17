package dataAccess;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class JdbcDao implements CourseDao, TeacherDao, CategoryDao {

	
	@Override
	public void add(Category category) {
		
		System.out.println("JDBC ile " + category + " Kategorisi eklendi.");
		
	}

	@Override
	public void add(Teacher teacher) {
		
		System.out.println("JDBC ile " + teacher + " Öðretmen eklendi.");
		
	}

	@Override
	public void add(Course course) {
		
		System.out.println("JDBC ile " + course + " Kursu eklendi.");
		
	}
	
	
	
}
