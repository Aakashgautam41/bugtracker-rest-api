package com.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootbackend.model.Employee;
import com.springbootbackend.model.Project;
import com.springbootbackend.model.Ticket;
import com.springbootbackend.repository.EmployeeRepository;
import com.springbootbackend.repository.ProjectRepository;
import com.springbootbackend.repository.TicketRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private TicketRepository ticketRepository;
	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("avrana", "kern", "avrana@gmail.com","123456",1));
		this.employeeRepository.save(new Employee("holsten", "mason", "holsten@gmail.com","123456",1));
		this.employeeRepository.save(new Employee("isa", "lain", "isa@gmail.com","123456",1));
		this.employeeRepository.save(new Employee("clarke", "griffin", "clarke@gmail.com","123456",2));
		this.employeeRepository.save(new Employee("marcus", "kane", "marcus@gmail.com","123456",2));
	
		this.projectRepository.save(new Project("Bugtracker", "BugTracker is an online bug tracker and issue tracking software that helps you to track and fix bugs quickly"));
		this.projectRepository.save(new Project("Inkscape", "Inkscape is professional quality vector graphics software which runs on Linux, Mac OS X and Windows desktop computers"));
		
		this.ticketRepository.save(new Ticket(1,"avrana","Holsten","Issue on login page","Error message is coming while login",2));
		this.ticketRepository.save(new Ticket(2,"clarke","Marcus","Cannot recreate calligraphy settings","I'm trying to create a gradual text the follow a path using Inkscape",5));
		
	}

}
