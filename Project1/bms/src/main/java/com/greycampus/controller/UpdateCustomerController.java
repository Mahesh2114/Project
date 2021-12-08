package com.greycampus.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.entity.Country;
import com.greycampus.entity.Customer;
import com.greycampus.entity.IndiaState;
import com.greycampus.entity.USAState;
import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/update")
public class UpdateCustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String welcome(HttpServletRequest req) {

		ArrayList<Country> countryList = customerService.getCountry();

		ArrayList<IndiaState> indiaStates = customerService.getIndiaStates();

		ArrayList<USAState> usaStates = customerService.getUsaStates();
		
		req.setAttribute("countryList", countryList);
		req.setAttribute("indiaList", indiaStates);
		req.setAttribute("usaList", usaStates);

		return "update.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String display(Customer customer, HttpServletRequest request) {
		customerService.update(customer);
		request.setAttribute("customer", customer);
		return "updatesuccess.jsp";
	}

}
