package kodlamaioWithNLayerApp.business;

import java.util.ArrayList;

import kodlamaioWithNLayerApp.core.logging.Logger;
import kodlamaioWithNLayerApp.dataAccess.CourseDao;
import kodlamaioWithNLayerApp.entities.Course;

public class CourseManager {
	private ArrayList<Course> courses = new ArrayList<Course>();
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers, ArrayList<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		for (Course existingCourse : courses) {
			if (existingCourse.getName() == course.getName()) {
				throw new Exception("Kurs ismi daha önce kullanılmış !");
			}
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan düşük olamaz !");
		}
		courseDao.add(course);
		for (Logger logger : loggers) { // [File,Console]
			logger.log("Kurs eklendi: " + course.getName());
		}
		courses.add(course);
	}

	public void update(Course course) throws Exception {
		for (Course existingCourse : courses) {
			if (existingCourse.getName() == course.getName()) {
				throw new Exception("Kurs ismi daha önce kullanılmış !");
			}
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan düşük olamaz !");
		}
		courseDao.update(course);
		for (Logger logger : loggers) { // [File,Console]
			logger.log("Kurs eklendi: " + course.getName());
		}

	}

	public void delete(Course course) {
		courseDao.delete(course);
		for (Logger logger : loggers) { // [File,Console]
			logger.log("Kurs silindi: " + course.getName());
		}
	}

	public Course getById(int id) {
		return courseDao.getById(id);
	}

	public ArrayList<Course> getAll() {
		return courseDao.getAll();
	}
}
