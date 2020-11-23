package com.myspringboot.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspringboot.model.EmployeeDetatils;
import com.myspringboot.repository.EmpRepository;

@Service
public class EmpService {
@Autowired
EmpRepository empRepository;

public void  saveEmployee(EmployeeDetatils emp) {
	
	 empRepository.save(emp);
}

	public EmployeeDetatils getEmployeeDetails(int empId) {
		
		
		return empRepository.findById(empId).get();
	}

	public EmployeeDetatils updateEmployeeDetails(int empId,EmployeeDetatils emp) {
		EmployeeDetatils updateEmp=new EmployeeDetatils();
		if(empRepository.findById(empId).isPresent() ){
	    updateEmp =empRepository.findById(empId).get();
			
		updateEmp.setName(emp.getName());
		updateEmp.setEmail(emp.getEmail());
		updateEmp.setPhoneNo(emp.getPhoneNo());
		updateEmp.setJobId(emp.getJobId());
		updateEmp.setSalary(emp.getSalary());
		empRepository.save(updateEmp);
		}
		
		return updateEmp;
	}

	

	public void deleteEmployee(int empId) {
		
		empRepository.deleteById(empId);
	}  

	

}
