package business;

import java.util.ArrayList;
import java.util.List;

import entities.Category;
import entities.Course;

public class MainManager {
	
	private Course course;
	private Category category;
	List<String> courses = new ArrayList<>();
	List<String> categories = new ArrayList<>();
	
	public void isCourse(String course) throws Exception {
		
		for(int i=0; i < courses.size(); i++) {
			
			if(courses.get(i) == course) {
				
				throw new Exception("Daha �nce bu isimde bir kurs oldu�u i�in eklenemez!");
			}
		}
		courses.add(course);
	}
	
	public void isCategories(String category) throws Exception {
		
		for(int i=0; i < categories.size(); i++) {
			
			if(categories.get(i) == category) {
				
				throw new Exception("Daha �nce bu isimde bir kategori oldu�u i�in eklenemez!");
			}
		}
		categories.add(category);
	}
	
	public void priceControl(double coursePrice) throws Exception {
		
		if(coursePrice < 0.0) {
			throw new Exception("Kurs �creti 0'dan k���k olamaz!");
		}
	}
}
