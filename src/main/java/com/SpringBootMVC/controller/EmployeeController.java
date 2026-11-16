package com.SpringBootMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootMVC.model.Employee;
import com.SpringBootMVC.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
   EmployeeService es;
	
	@GetMapping("/addEmp")
public String addEmp() {
	return "addEmployee";
}
	
	@PostMapping("/saveEmp")
	public ModelAndView saveEmp(@ModelAttribute Employee emp) {
		es.addEmployee(emp);
		System.out.println("employee register successfully");
		return new ModelAndView("redirect:/employees/addEmp");
	}
	
	
	@GetMapping("/getEmp")
	public ModelAndView getAllEmployee() {
		List<Employee> emps= es.getAllEmp();
		ModelAndView mv=new ModelAndView();
		mv.addObject("employees",emps);
		mv.setViewName("employeelist");
		return mv;
	}
	
	@GetMapping("/{eid}/delete")
	public ModelAndView deleteEid(@PathVariable int eid) {
		es.deleteByEid(eid);
		return new ModelAndView("redirect:/employees/getEmp");
	}

	
}
