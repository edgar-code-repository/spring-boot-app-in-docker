package com.example.geo.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.geo.repositories.dto.CountryDTO;

@Service
public class CountryRepository {
	
	public List<CountryDTO> getAllCountries() {
		List<CountryDTO> countriesList = new ArrayList<CountryDTO>();
		
		CountryDTO country1 = new CountryDTO();
		country1.setId("001");
		country1.setName("Chile");
		country1.setCapital("Santiago");
		country1.setPopulation(17574003);
		country1.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/7/78/Flag_of_Chile.svg");
		
		CountryDTO country2 = new CountryDTO();
		country2.setId("002");
		country2.setName("Argentina");
		country2.setCapital("Buenos Aires");
		country2.setPopulation(40117096);
		country2.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Argentina.svg");		
		
		countriesList.add(country1);
		countriesList.add(country2);
		
		return countriesList;
	}

}
