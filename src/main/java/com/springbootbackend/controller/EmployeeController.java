package com.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbootbackend.model.Employee;
import com.springbootbackend.repository.EmployeeRepository;
import com.springbootbackend.repository.ProjectRepository;

@RestController
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee>  getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	//add new employees
	@PostMapping("/register")
	public Employee postRegisterPage(Employee employee,
			@RequestParam("firstName")String firstName,
			@RequestParam("lastName")String lastName,
			@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("projectId")int projectId
			) {
	
		employee.setEmailId(email.toLowerCase());
		employee.setFirstName(firstName.toLowerCase());
		employee.setLastName(lastName.toLowerCase());
		employee.setPassword(password);
		employee.setProjectId(projectId);
		employeeRepository.save(employee);
		
		return employee;
		
	}
	
	// validate employee credentials
	@PostMapping("/login")
	public String postLoginPage(@RequestParam String email, @RequestParam String password){	
		email = email.toLowerCase();
		Employee data = employeeRepository.findByEmailId(email);

		if(data == null) {
			return "Email address doesn't exist";
		}
		
		String userEmail = data.getEmailId();
		String pass = data.getPassword();
		
		if(!userEmail.equalsIgnoreCase(email)  || !pass.equalsIgnoreCase(password)) {
			return "Wrong password";
		}

		return "Valid Credentials !!!";
	}
}





