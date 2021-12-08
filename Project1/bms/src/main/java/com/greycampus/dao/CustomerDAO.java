package com.greycampus.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.Country;
import com.greycampus.entity.Customer;
import com.greycampus.entity.IndiaState;
import com.greycampus.entity.USAState;
import com.greycampus.repo.CountryRepo;
import com.greycampus.repo.CustomerRepo;
import com.greycampus.repo.IndiaStateRepo;
import com.greycampus.repo.USAStateRepo;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private IndiaStateRepo indiastateRepo;
	
	@Autowired
	private USAStateRepo usastateRepo;
	@Transactional
	public ArrayList<USAState> getUsaStates() {
		return usastateRepo.findAll();
		 
	}
	@Transactional
	public ArrayList<IndiaState> getIndiaStates() {
		return indiastateRepo.findAll();
	}
	@Transactional
	public ArrayList<Country> getCountry() {
		ArrayList<Country> employeeList = countryRepo.findAll();
		return employeeList;
	}
    @Transactional
	public void save(Customer customer) {
		customerRepo.save(customer);
	}
    @Transactional
	public void update(Customer customer) {
		customerRepo.save(customer);
	}
    @Transactional
	public void delete(int cid) {
		customerRepo.deleteById(cid);
	}
    
    @Transactional
	public List<Customer> fetchbycid(Customer customer) {
		 Customer customer2 = customerRepo.findById(customer.getCid()).get();
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(customer2);
		return list;
	}
    @Transactional
	public List<Customer> fetchbyname(Customer customer) {
		List<Customer> list = customerRepo.findByName(customer.getName());
		return list;
	}
     @Transactional
	public List<Customer> fetchall() {
		Iterable<Customer> userlist = customerRepo.findAll();
		return (List<Customer>) userlist;
	}
}
