package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import Kodlama.io.Devs.entities.concretes.Languages;

@Repository
public class InMemoryLanguagesRepository implements LanguagesRepository
{

	List<Languages> Language;
	
	public InMemoryLanguagesRepository() {
		Language = new ArrayList<Languages>();
		Language.add(new Languages("phyton",1));
		Language.add(new Languages("java",2));
		Language.add(new Languages("javascript",3));
		Language.add(new Languages("c",4));
		Language.add(new Languages("c#",5));
		
	}
	
	
	@Override
	public List<Languages> getAll() {
		
		return Language;
	}

	@Override
	public void add(Languages language) {
		Language.add(language);
		
	}

	@Override
	public void delete(int id) {
		Language.remove(id);
		
	}

	@Override
	public void update(Languages language) {
		for (Languages languages : Language) {
			if(languages.getId() == language.getId()) {
				languages.setName(language.getName());
			}
			
		}
		
	}

	@Override
	public Languages getById(int id) {
		for (Languages languages : Language) {
			if(languages.getId() ==id) {
				return languages;
			}
			
		}
		return null;
	}

}
