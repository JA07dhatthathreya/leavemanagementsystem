package com.hexaware.leavemanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.leavemanagementsystemproject.entities.Employees;

public interface EmployeesRepository  extends JpaRepository<Employees,Long>{

}
