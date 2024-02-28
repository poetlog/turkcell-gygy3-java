package kodlamaioWithNLayerApp.dataAccess;

import java.util.ArrayList;

import kodlamaioWithNLayerApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course){
        System.out.println("Hibernate ile veri eklendi");
    }

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile güncellendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile silindi");
		
	}

	@Override
	public Course getById(int id) {
		System.out.println("Hibernate ile kursun id'si alındı");
		return null;
	}

	@Override
	public ArrayList<Course> getAll() {
		System.out.println("Hibernate ile tüm kurs listesi alındı.");
		return new ArrayList<>();
	}
}
