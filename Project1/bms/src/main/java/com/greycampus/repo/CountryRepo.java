package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.Country;

public interface CountryRepo extends CrudRepository<Country, Integer> {
	
	public ArrayList<Country> findAll();
}
