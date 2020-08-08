package com.example.geo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geo.repositories.CountryRepository;
import com.example.geo.repositories.dto.CountryDTO;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CountryController {
	
	@Autowired
	CountryRepository countryRepository;

	@RequestMapping("/countries")
	public List<CountryDTO> getAllCountries() {
		List<CountryDTO> countriesList = countryRepository.getAllCountries();
		return countriesList;
	}
	
}
