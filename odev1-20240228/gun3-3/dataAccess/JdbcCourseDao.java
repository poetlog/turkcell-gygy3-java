package kodlamaioWithNLayerApp.dataAccess;


import java.util.ArrayList;
import kodlamaioWithNLayerApp.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course){
        System.out.println("JDBC ile eklendi");
    }

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile güncellendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile silindi");
		
	}

	@Override
	public Course getById(int id) {
		System.out.println("JDBC ile kursun id'si alındı");
		return null;
	}

	@Override
	public ArrayList<Course> getAll() {
		System.out.println("JDBC ile tüm kurs listesi alındı.");
		return new ArrayList<>();
	}
}
