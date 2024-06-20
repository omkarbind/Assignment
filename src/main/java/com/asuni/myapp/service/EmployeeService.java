package com.asuni.myapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asuni.myapp.POJO.Employee;
import com.asuni.myapp.entity.EmployeeEntity;
import com.asuni.myapp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	

	@Autowired
	private EmployeeRepository repository;

	public Employee createEmployee(Employee st) {
		EmployeeEntity s = new EmployeeEntity(st);
		EmployeeEntity entity = repository.save(s);
		return new Employee(entity);
	}

	public List<Employee> getAllEmployees() {
		List<EmployeeEntity> listEntity = repository.findAll();
		List<Employee> listEmployees = listEntity.stream().map(x -> new Employee(x)).collect(Collectors.toList());
		return listEmployees;

	}

	public Employee updateEmployee(Employee st) {

		EmployeeEntity s = new EmployeeEntity(st);
		EmployeeEntity entity = repository.save(s);
		return new Employee(entity);
	}

	public void deleteEmployee(Integer id) {

		repository.deleteByEid(id);
	}

	public Employee findEmployee(Integer id) {

		return repository.findByEid(id);
	}
	
	public void delete(EmployeeEntity entity){
		repository.delete(entity);
	}

}
