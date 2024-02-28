package kodlamaioWithNLayerApp.business;

import java.util.ArrayList;

import kodlamaioWithNLayerApp.core.logging.Logger;
import kodlamaioWithNLayerApp.dataAccess.CategoryDao;
import kodlamaioWithNLayerApp.entities.Category;

public class CategoryManager {
	private ArrayList<Category> categories = new ArrayList<Category>();
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, ArrayList<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category existingCategories : categories) {
			if (existingCategories.getName() == category.getName()) {
				throw new Exception("Kategori ismi daha önce eklenmiş !");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) { // [File,Console]
			logger.log("Kategori eklendi: " + category.getName());
		}
		categories.add(category);
	}

	public void update(Category category) throws Exception {
		for (Category existingCategories : categories) {
			if (existingCategories.getName() == category.getName()) {
				throw new Exception("Kategori ismi daha önce eklenmiş !");
			}
		}
		categoryDao.update(category);
		for (Logger logger : loggers) { // [File,Console]
			logger.log("Kategori eklendi: " + category.getName());
		}

	}

	public void delete(Category category) {
		categoryDao.delete(category);
		for (Logger logger : loggers) { // [File,Console]
			logger.log("Kategori silindi: " + category.getName());
		}
	}

	public Category getById(int id) {
		return categoryDao.getById(id);
	}

	public ArrayList<Category> getAll() {
		return categoryDao.getAll();
	}
}
