package com.myspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myspringboot.model.EmployeeDetatils;


public interface EmpRepository extends JpaRepository<EmployeeDetatils, Integer>{

}
