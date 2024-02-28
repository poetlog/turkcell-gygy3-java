package kodlamaioWithNLayerApp;

import kodlamaioWithNLayerApp.business.CourseManager;
import kodlamaioWithNLayerApp.business.CategoryManager;
import kodlamaioWithNLayerApp.entities.Category;
import kodlamaioWithNLayerApp.entities.Course;
import kodlamaioWithNLayerApp.entities.Instructor;
import kodlamaioWithNLayerApp.core.logging.ConsoleLogger;
import kodlamaioWithNLayerApp.core.logging.FileLogger;
import kodlamaioWithNLayerApp.core.logging.Logger;
import kodlamaioWithNLayerApp.dataAccess.JdbcCategoryDao;
import kodlamaioWithNLayerApp.dataAccess.JdbcCourseDao;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		{

			Course course = new Course(1, "Java", 100, new Instructor("Engin"), new Category("Programming"));
			//Course course2 = new Course(2, "Java", 100, new Instructor("Engin"), new Category("Programming"));
			//Course course3 = new Course(3, "Java", 100, new Instructor("Engin"), new Category("Programming"));
			
			Logger[] loggers = new Logger[] { new ConsoleLogger(), new FileLogger()};
			ArrayList<Course> courses = new ArrayList<Course>();
			CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
			
			courseManager.add(course);
			//courseManager.add(course2);
			//courseManager.update(course3);
			
			Category category = new Category("Programming");
			//Category category2= new Category("Programming");
			ArrayList<Category> categories = new ArrayList<Category>();
			CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
			categoryManager.add(category);
			//categoryManager.add(category2);
		}
	}
}
