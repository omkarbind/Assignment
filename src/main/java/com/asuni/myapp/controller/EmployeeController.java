package com.asuni.myapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.asuni.myapp.POJO.Employee;
import com.asuni.myapp.entity.EmployeeEntity;
import com.asuni.myapp.service.EmployeeService;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {


	@Autowired
	private EmployeeService service;
	

	@Value("${name}")
	private String names;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  defaultpage( ) {
		
	    
		List<Employee> list = service.getAllEmployees();
		
		ModelAndView map = new ModelAndView("home");
	    map.addObject("lists", list);
		
		
		return map;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView  home( ) {
		
	    
		List<Employee> list = service.getAllEmployees();
		
		ModelAndView map = new ModelAndView("home");
	    map.addObject("lists", list);
		
		
		return map;
	}




	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView  list( ) {
		
	    
		List<Employee> list = service.getAllEmployees();
		
		ModelAndView map = new ModelAndView("list");
	    map.addObject("lists", list);
		
		
		return map;
	}
	
   
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greeting() {

		return names;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test() {

		ModelAndView map = new ModelAndView("greet");
	    map.addObject("status", "abc");
		return map;
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addNewEmployeeUI() {
		
		ModelAndView map = new ModelAndView("insert");
	    map.addObject("status", "");
	    
		return map;
	}
	
	@PostMapping(value = "/add", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView addNewEmployee(@ModelAttribute Employee emp) {
	    
		Employee emp1 = service.createEmployee(emp);
		
		ModelAndView map = new ModelAndView("insert");
	    map.addObject("emp", emp1);
	    map.addObject("status", "Successfully Added.");
	    
	    return map;
	}

	
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateUI( @RequestParam(name = "eid") Integer eid) {
		Employee emp = service.findEmployee(eid);
		ModelAndView map = new ModelAndView("update");
	    map.addObject("emp", emp);
	    map.addObject("status", "");
	
		return map;
		
	}
	
	
	
	
	@PostMapping(value = "/update", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView updateEmployee(@ModelAttribute Employee emp) {
	    
		Employee emp1 = service.updateEmployee(emp);
		
		ModelAndView map = new ModelAndView("update");
	    map.addObject("emp", emp1);
	    map.addObject("status", "Successfully updated.");
	    
	    return map;
	}


	
	
	

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteEmployee( @RequestParam(name = "eid") Integer eid,ModelMap model) {
		
		Employee emp1 = service.findEmployee( eid );
		service.delete( new EmployeeEntity(emp1) );
		
		
		return new ModelAndView("redirect:/home", model);
		
	}



	@RequestMapping(value = "/deleteui", method = RequestMethod.GET)
	public String deleteEmployeeUI( )  {
		
		return "deleteui";
		
	}
	
	
	
	
	@RequestMapping(value = "/findandupdate", method = RequestMethod.GET)
	public ModelAndView findAndUpdateUI() {
		
		ModelAndView map = new ModelAndView("findandupdate");
	    
		return map;
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public ModelAndView findEmployeeUI() {
		
		ModelAndView map = new ModelAndView("find");
	    map.addObject("status", "");
	    
		return map;
	}



	
	
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public ModelAndView findEmployee( @RequestParam(name = "eid") Integer eid) {
	    
		Employee emp1 = service.findEmployee( eid );
		
		ModelAndView map = new ModelAndView("findrec");
	    map.addObject("emp", emp1);
	    
	    return map;
	}



	@RequestMapping(value = "/find1", method = RequestMethod.POST)
	public ModelAndView findEmployee1( @RequestParam(name = "eid") Integer eid) {
	    
		Employee emp1 = service.findEmployee( eid );
		
		ModelAndView map = new ModelAndView("finded");
	    map.addObject("emp", emp1);
	    
	    return map;
	}
	
	

}
