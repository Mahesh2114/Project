package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.USAState;

public interface USAStateRepo extends CrudRepository<USAState, Integer> {
	
	public ArrayList<USAState> findAll();


}
