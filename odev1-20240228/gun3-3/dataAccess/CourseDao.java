package kodlamaioWithNLayerApp.dataAccess;

import java.util.ArrayList;
import kodlamaioWithNLayerApp.entities.Course;

public interface CourseDao {
	void add(Course course);
    void update(Course course);
    void delete(Course course);
    Course getById(int id);
    ArrayList<Course> getAll();
}
