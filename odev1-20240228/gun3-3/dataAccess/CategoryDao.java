package kodlamaioWithNLayerApp.dataAccess;

import java.util.ArrayList;

import kodlamaioWithNLayerApp.entities.Category;


public interface CategoryDao {
	void add(Category category);
    void update(Category category);
    void delete(Category category);
    Category getById(int id);
    ArrayList<Category> getAll();
}
