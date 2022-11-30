package homeWork.business;

import homeWork.dataAccess.CategoryDao;
import homeWork.entities.Category;
import homeWork.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger [] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		if(category.getName() == category.getName()) {
			 throw new Exception("Kategori ismi tekrar edemez");
		}
		
		categoryDao.add(category);
		for (Logger logger : loggers) { 
       	 logger.log(category.getName()); 
		}
	}
}
