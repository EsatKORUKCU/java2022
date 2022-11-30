package homeWork.business;


import homeWork.dataAccess.InstructorDao;
import homeWork.entities.Instructor;
import homeWork.logging.Logger;

public class InstructorManager {
	
	private Logger[] loggers;
	private InstructorDao instructorDao;
	
	public InstructorManager(InstructorDao instructorDao, Logger [] loggers) {
		
		this.instructorDao=instructorDao;
		this.loggers = loggers;
		
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) { 
	       	 logger.log(instructor.getName()); 
			}
	}
}
