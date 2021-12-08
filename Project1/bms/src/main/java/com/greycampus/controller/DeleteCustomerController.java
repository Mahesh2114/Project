package com.greycampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/delete")
public class DeleteCustomerController {
	

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		return "delete.jsp";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String display(int cid) {
		customerService.delete(cid);
		return "deletesuccess.jsp";
	}


}
