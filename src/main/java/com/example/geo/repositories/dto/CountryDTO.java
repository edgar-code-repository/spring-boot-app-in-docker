package com.example.geo.repositories.dto;

public class CountryDTO {

	private String id;
	private String name;
	private String capital;
	private long population;
	private String imageFlagUrl;
	
	public CountryDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getImageFlagUrl() {
		return imageFlagUrl;
	}

	public void setImageFlagUrl(String imageFlagUrl) {
		this.imageFlagUrl = imageFlagUrl;
	}
	
	

	
	
	
}
