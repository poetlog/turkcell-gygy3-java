package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import Kodlama.io.Devs.entities.concretes.Languages;

@Service
public class LanguageManager implements LanguageService{

	private LanguagesRepository languagesRepository;
	
	@Autowired
	public LanguageManager(LanguagesRepository languagesRepository) {

		this.languagesRepository = languagesRepository;
	}

	@Override
	public List<Languages> getAll() {
		
		return languagesRepository.getAll();
	}

	@Override
	public void add(Languages language) throws Exception {
		
		if(language.getName().isEmpty()) {
			throw new Exception("Dil ismi bos birakilamaz.");
		}
		
		for (Languages language1 : getAll()) {
			if(language1.equals(language)) {
				throw new Exception("Dil isimleri tekrar edemez lütfen baska bir isim girin.");
			}
		}
		
		languagesRepository.add(language);
		
	}

	@Override
	public void delete(int id) {
		languagesRepository.delete(id);
		
	}

	@Override
	public void update(Languages language) throws Exception {
		
		if(language.getName().isEmpty()) {
			throw new Exception("Dil ismi bos birakilamaz.");
		}
		
		for (Languages language1 : getAll()) {
			if(language1.equals(language)) {
				throw new Exception("Dil isimleri tekrar edemez lütfen baska bir isim girin.");
			}
		}
		
		languagesRepository.update(language);
		
	}

	@Override
	public Languages getById(int id) {
		
		return languagesRepository.getById(id);
	}

}
