package com.noQ.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
@RequestMapping(value = "/api/employees")
public class AddToCartController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getEmployees() {
	return this.employees;
	}
	

}
