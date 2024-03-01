package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguageService {
	
	List<Languages> getAll();
	
	void add(Languages language)  throws Exception;
	void delete(int id);
	void update(Languages language) throws Exception;
	Languages getById(int id);

}
