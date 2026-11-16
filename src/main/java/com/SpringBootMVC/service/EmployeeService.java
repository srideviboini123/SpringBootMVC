package com.SpringBootMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootMVC.model.Employee;
import com.SpringBootMVC.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository er;
	
	public void addEmployee(Employee emp) {
		er.save(emp);
	}
	public List<Employee>  getAllEmp(){
		return er.findAll();
	}
	
	public void deleteByEid(int eid) {
		er.deleteById(eid);
	}
	

}
