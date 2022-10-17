import business.CategoryManager;
import business.CourseManager;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Category;
import entities.Course;
import logging.DatabaseLogger;
import logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category = new Category("Frontend");
		Category category2 = new Category("Backend");
		Course course = new Course("Java", "Engin Demiroð", 123.0);
		
		Logger[] loggers = {new DatabaseLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		
		categoryManager.add(category);
		categoryManager.add(category2);
		courseManager.add(course);
	}

}
