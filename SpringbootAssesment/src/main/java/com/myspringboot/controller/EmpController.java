package com.myspringboot.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.myspringboot.model.EmployeeDetatils;
import com.myspringboot.service.EmpService;

@RestController
public class EmpController {
	
	
	@Autowired
	EmpService empService;
	
	
	
	
	@PostMapping("/addEmployee")
	public EmployeeDetatils  saveEmployee( @Valid @RequestBody EmployeeDetatils emp){
		empService.saveEmployee(emp);
		return emp;
	
	}
	
	@GetMapping("/getEmployee/{empId}")
	public EmployeeDetatils getEmployeeDetails(@PathVariable("empId") int empId){
		
		return empService.getEmployeeDetails(empId);
	}
	
	@PutMapping("/updateEmployee/{empId}")
	public EmployeeDetatils updateEmployeeDetails(@PathVariable("empId") int empId,@RequestBody EmployeeDetatils emp){
		emp=empService.updateEmployeeDetails(empId,emp);
		return emp;
		
	}
	
	@DeleteMapping("/delEmployee/{empId}") 
	public void delEmployeeDetails(@PathVariable("empId") int empId){
		
		empService.deleteEmployee(empId);  
	}
	
	
	
}
