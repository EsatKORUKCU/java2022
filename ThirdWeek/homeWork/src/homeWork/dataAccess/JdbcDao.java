package homeWork.dataAccess;

import homeWork.entities.Category;
import homeWork.entities.Course;
import homeWork.entities.Instructor;

public class JdbcDao implements CategoryDao,CourseDao,InstructorDao{

	@Override
	public void add(Instructor instructor) {
		 System.out.println("JDBC ile veritabanina eklendi");
		
	}

	@Override
	public void add(Course course) {
		 System.out.println("JDBC ile veritabanina eklendi");
		
	}

	@Override
	public void add(Category category) {
		 System.out.println("JDBC ile veritabanina eklendi");
		
	}
	
}
