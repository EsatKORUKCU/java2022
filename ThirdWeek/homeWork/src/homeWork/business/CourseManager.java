package homeWork.business;


import homeWork.dataAccess.CourseDao;
import homeWork.entities.Course;
import homeWork.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger [] loggers) {
		this.courseDao=courseDao;
		this.loggers = loggers;
		
	}
	
	public void add(Course course) throws Exception {
		if(course.getName() == course.getName()){
			 throw new Exception("Kurs ismi tekrar edemez");
		}
		if(course.getPrice()<0){
			 throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) { 
	       	 logger.log(course.getName()); 
			}
	}

	
}
