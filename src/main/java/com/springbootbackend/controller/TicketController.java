package com.springbootbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbackend.model.Employee;
import com.springbootbackend.model.Ticket;
import com.springbootbackend.repository.EmployeeRepository;
import com.springbootbackend.repository.TicketRepository;

@RestController
@RequestMapping("/")
public class TicketController {
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// get all tickets
	@GetMapping("/tickets")
	public List<Ticket> getAllTickets(ModelMap model, @ModelAttribute Employee employee){
		int id = (int) employee.getId();
		List<Ticket> ticketList = ticketRepository.findAll();
		model.put("tickets", ticketList);
		return ticketList; 
	}
	
	// get all tickets of an individual project
	@GetMapping("/projects/{projectId}/tickets")
	public List<Ticket> getAllTicketsForProject(@PathVariable("projectId") int projectId){
		List<Ticket> ticketList = ticketRepository.findByProjectId(projectId);
		return ticketList; 
	}
	
	// get individual ticket of a project
	@PostMapping("/projects/{projectId}/createTicket")
	public Ticket postCreateTicket(@PathVariable("projectId") int projectId, Ticket ticket,
			@RequestParam String title, 
			@RequestParam String description,
			@RequestParam String createdBy,
			@RequestParam int employeeId){
		Optional<Employee> getEmployeeObject = employeeRepository.findById((long) employeeId);
		Employee employeeObject = getEmployeeObject.get();
		String assignedTo = employeeObject.getFirstName();
		ticket.setTitle(title);
		ticket.setDesc(description);
		ticket.setCreatedBy(createdBy.toLowerCase());
		ticket.setIssuedTo(assignedTo.toLowerCase());
		ticket.setProjectId(projectId);
		ticket.setEmployeeId(employeeId);
		
		ticketRepository.save(ticket);
		
		return ticket; 
	}
	
	// get individual ticket by ticket id
	@GetMapping("/tickets/{ticketId}")
	public Optional<Ticket> getSingleTicket(@PathVariable("ticketId") Long ticketId){
		Optional<Ticket> ticket = ticketRepository.findById(ticketId);
		return ticket;
	}
}
