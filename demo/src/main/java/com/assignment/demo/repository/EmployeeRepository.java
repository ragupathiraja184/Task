package com.assignment.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.demo.modal.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findByEmpId(String empId);
	@Query("SELECT e FROM Employee e ORDER BY e.firstName ASC")
	List<Employee> getAllEmployee();
}
