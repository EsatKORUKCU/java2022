package homeWork;


import homeWork.business.CategoryManager;
import homeWork.business.CourseManager;
import homeWork.business.InstructorManager;
import homeWork.dataAccess.HibernateDao;
import homeWork.dataAccess.JdbcDao;
import homeWork.entities.Category;
import homeWork.entities.Course;
import homeWork.entities.Instructor;
import homeWork.logging.DatabaseLogger;
import homeWork.logging.FileLogger;
import homeWork.logging.MailLogger;
import homeWork.logging.Logger;


public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		Category category1 = new Category(1,"Yazılım");
		Category category2 = new Category(2,"Programlama");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(),loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		
		
		Course course1 = new Course(1,"Java",1000);
		Course course2 = new Course(2,"Python",990);
		Course course3 = new Course(3,"Php",980);
		
		CourseManager courseManager = new CourseManager(new JdbcDao(),loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		
		Instructor instructor1 = new Instructor(1,"Engin","DEMİROĞ");
		Instructor instructor2 = new Instructor(2,"Esat","KÖRÜKCÜ");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcDao(),loggers);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		
	}

}
