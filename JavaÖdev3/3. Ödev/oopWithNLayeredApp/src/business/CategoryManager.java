package business;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private MainManager mainManager = new MainManager();
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		
		mainManager.isCategories(category.getCategoryName());
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			
			logger.log("\nKategori Adi : " + category.getCategoryName());
		}
	}
}
