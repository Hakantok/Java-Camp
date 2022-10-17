package dataAccess;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class HibernateDao implements CourseDao, TeacherDao, CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile " + category + " Kategorisi eklendi.");
		
	}

	@Override
	public void add(Teacher teacher) {
		
		System.out.println("Hibernate ile " + teacher + " Öðretmen eklendi.");
		
	}

	@Override
	public void add(Course course) {
		
		System.out.println("Hibernate ile " + course + " Kursu eklendi.");
		
	}

}
