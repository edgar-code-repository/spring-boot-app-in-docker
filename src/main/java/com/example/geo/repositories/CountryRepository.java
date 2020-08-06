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
		
		CountryDTO country3 = new CountryDTO();
		country3.setId("003");
		country3.setName("Peru");
		country3.setCapital("Lima");
		country3.setPopulation(31237385);
		country3.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/3/3a/Bandera_del_Per%C3%BA.jpg");	
		
		CountryDTO country4 = new CountryDTO();
		country4.setId("004");
		country4.setName("Bolivia");
		country4.setCapital("La Paz");
		country4.setPopulation(11428245);
		country4.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Bandera_de_Bolivia_%28Estado%29.svg/1200px-Bandera_de_Bolivia_%28Estado%29.svg.png");	
		
		CountryDTO country5 = new CountryDTO();
		country5.setId("005");
		country5.setName("Paraguay");
		country5.setCapital("Asuncion");
		country5.setPopulation(7252672);
		country5.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/2/27/Flag_of_Paraguay.svg");	
		
		CountryDTO country6 = new CountryDTO();
		country6.setId("006");
		country6.setName("Uruguay");
		country6.setCapital("Montevideo");
		country6.setPopulation(40117096);
		country6.setImageFlagUrl("https://www.sitographics.com/enciclog/banderas/america/image_2012/Uruguay.gif");
		
		CountryDTO country7 = new CountryDTO();
		country7.setId("007");
		country7.setName("Brasil");
		country7.setCapital("Brasilia");
		country7.setPopulation(210385000);
		country7.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/300px-Flag_of_Brazil.svg.png");
		
		CountryDTO country8 = new CountryDTO();
		country8.setId("008");
		country8.setName("Ecuador");
		country8.setCapital("Quito");
		country8.setPopulation(17300000);
		country8.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/e/e8/Flag_of_Ecuador.svg");
		
		CountryDTO country9 = new CountryDTO();
		country9.setId("009");
		country9.setName("Colombia");
		country9.setCapital("Bogota");
		country9.setPopulation(50372424);
		country9.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/2/21/Flag_of_Colombia.svg");
		
		CountryDTO country10 = new CountryDTO();
		country10.setId("010");
		country10.setName("Venezuela");
		country10.setCapital("Caracas");
		country10.setPopulation(28887118);
		country10.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1200px-Flag_of_Venezuela.svg.png");		
		
		countriesList.add(country1);
		countriesList.add(country2);
		countriesList.add(country3);
		countriesList.add(country4);
		countriesList.add(country5);
		
		countriesList.add(country6);
		countriesList.add(country7);
		countriesList.add(country8);
		countriesList.add(country9);
		countriesList.add(country10);
		
		return countriesList;
	}

}
