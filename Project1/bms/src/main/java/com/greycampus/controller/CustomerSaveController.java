package com.greycampus.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.entity.Country;
import com.greycampus.entity.Customer;
import com.greycampus.entity.IndiaState;
import com.greycampus.entity.USAState;
import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/save")
public class CustomerSaveController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String welcome(Customer customer, Model model) {
		
		ArrayList<Country> countryList = customerService.getCountry();
		
		ArrayList<IndiaState> indiaStates = customerService.getIndiaStates();
		
		ArrayList<USAState> usaStates = customerService.getUsaStates();
		
		model.addAttribute("countryList", countryList);
		model.addAttribute("indiaList", indiaStates);
		model.addAttribute("usaList", usaStates);
		
		return "save.jsp";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String display(Customer customer, HttpServletRequest request) {
		
		System.out.println(customer.getCid());
		request.setAttribute("customer", customer);
		customerService.save(customer);
		return "savesuccess.jsp";
	}

}
