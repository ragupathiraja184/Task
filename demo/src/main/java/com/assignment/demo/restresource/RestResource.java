package com.assignment.demo.restresource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.modal.Employee;
import com.assignment.demo.modal.Manager;
import com.assignment.demo.repository.EmployeeRepository;
import com.assignment.demo.repository.ManagerRepository;

@RestController
public class RestResource {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping(value = "/addManager", method = RequestMethod.POST, produces = "application/json")
	public String addLicense(@RequestBody  Manager manager) {
		try {
			Manager managerEntity = managerRepository.findByEmail(manager.getEmail());
			if(managerEntity != null) {
				return "Email already exist.";
			}
			else {
				managerEntity = new Manager();
				managerEntity.setAddress(manager.getAddress());
				managerEntity.setCity(manager.getCity());
				managerEntity.setCompany(manager.getCompany());
				managerEntity.setDob(manager.getDob());
				managerEntity.setEmail(manager.getEmail());
				managerEntity.setFirstName(manager.getFirstName());
				managerEntity.setLastName(manager.getLastName());
				managerEntity.setMobile(manager.getMobile());
				managerEntity.setRole(manager.getRole());
				managerEntity.setPassword(bCryptPasswordEncoder.encode(manager.getPassword()));
				
				return "Success: Manager Entity Saved Successfully";
			}
		}
		
		catch(Exception e) {
			return "Error: Manager Entity Saved Successfully";
		}
		
		}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST, produces = "application/json")
	public String addEmployee(@RequestBody  Employee employee) {
		try {
			Employee employeeEntity = employeeRepository.findByEmpId(employee.getEmpId());
			if(employeeEntity != null) {
				return "Email already exist.";
			}
			else {
				employeeEntity = new Employee();
				employeeEntity.setAddress(employee.getAddress());
				employeeEntity.setCompany(employee.getCompany());
				employeeEntity.setDob(employee.getDob());
				employeeEntity.setEmpId(employee.getEmpId());
				employeeEntity.setFirstName(employee.getFirstName());
				employeeEntity.setLastName(employee.getLastName());
				employeeEntity.setRole(employee.getRole());
				employeeEntity.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
				
				return "Success: Manager Entity Saved Successfully";
			}
		}
		
		catch(Exception e) {
			return "Error: Manager Entity Saved Successfully";
		}
		
		}
	
	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.POST, produces = "application/json")
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = new ArrayList<>();
		try {
			employeeList = employeeRepository.getAllEmployee();
			if(employeeList.size() > 0) {
				return employeeList;
			}
			else {
				return employeeList;
			}
		}
		
		catch(Exception e) {
			return employeeList;
		}
		
		}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST, produces = "application/json")
	public String updateEmployee(@RequestBody  Employee employee) {
		try {
			Employee employeeEntity = employeeRepository.findByEmpId(employee.getEmpId());
			if(employeeEntity != null) {
				employeeEntity = new Employee();
				employeeEntity.setAddress(employee.getAddress());
				employeeEntity.setCompany(employee.getCompany());
				employeeEntity.setDob(employee.getDob());
				employeeEntity.setEmpId(employee.getEmpId());
				employeeEntity.setFirstName(employee.getFirstName());
				employeeEntity.setLastName(employee.getLastName());
				employeeEntity.setRole(employee.getRole());
				employeeEntity.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
				return "Success: Manager Entity updated Successfully";
			}
			else {
				return "Failure: Manager Entity has not been updated";
			}
			
			
		}
		
		catch(Exception e) {
			return "Error: Manager Entity has not been updated";
		}
		
		}
	
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteEmployee(@RequestParam("empId") String empId) {
		try {
			Employee employeeEntity = employeeRepository.findByEmpId(empId);
			if(employeeEntity != null) {
				employeeRepository.delete(employeeEntity);
				return "Success: Manager Entity has been deleted";
			}
			else {
				return "Failure: Manager Entity has not been deleted";
			}
			
		}
		catch(Exception e) {
			return "Error: Manager Entity has not been deleted";
		}
		
		}
}
