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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class RestEmpCtr {


	@Autowired
	private EmployeeService service;
	


	@RequestMapping(value = "/checkeid", method = RequestMethod.GET)
	public String findEmployee( @RequestParam(name = "eid") Integer eid) {
	    
		Employee emp1 = service.findEmployee( eid );
		
		if( emp1 != null || emp1.getEid() != null ){
			return "Already Registered";
		}else
			return "user id Available";
	    
	}

	@RequestMapping(value = "/delete1", method = RequestMethod.POST)
	public String deleteEmployee( @RequestParam(name = "eid") Integer eid) {

		String message = "Ohsit";
	    
	    try{

		    Employee emp1 = service.findEmployee( eid );
		    service.delete( new EmployeeEntity(emp1) );
		    
		    if( emp1 != null || emp1.getEid() != null ){
		    	message= "Delete Successfully.";
		    }
			
		}catch(NullPointerException e){
            message= "Employee not found" ;
		}catch(Exception e){
            message= "Delete Successfully." ;
		}

		return message;
	    
	}
	
	

}
