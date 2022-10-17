package business;

import logging.Logger;

import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private MainManager mainManager = new MainManager();
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		mainManager.isCourse(course.getCourseName());
		mainManager.priceControl(course.getCoursePrice());
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			
			logger.log("\nKurs Adi : " + course.getCourseName());
			logger.log("\nKurs Öðretmeni : " + course.getTeacherName());
			logger.log("\nKurs Ücreti : " + course.getCoursePrice());
		}
	}
	
	
}
