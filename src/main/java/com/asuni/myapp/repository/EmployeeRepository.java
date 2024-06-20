package com.asuni.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asuni.myapp.POJO.Employee;
import com.asuni.myapp.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	EmployeeEntity save(EmployeeEntity st); 

	List<EmployeeEntity> findAll(); 

	void delete(EmployeeEntity entity);
	
	void deleteByEid(Integer id);

	Employee findByEid(Integer id); 
	
	Employee findByFname(String name); 

}
