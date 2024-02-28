package kodlamaioWithNLayerApp.dataAccess;

import java.util.ArrayList;

import kodlamaioWithNLayerApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("JDBC ile eklendi");
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile güncellendi");

	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile silindi");

	}

	@Override
	public Category getById(int id) {
		System.out.println("JDBC ile kursun id'si alındı");
		return null;
	}

	@Override
	public ArrayList<Category> getAll() {
		System.out.println("JDBC ile tüm kurs listesi alındı.");
		return new ArrayList<>();
	}
}
