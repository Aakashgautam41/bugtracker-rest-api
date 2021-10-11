package com.springbootbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbackend.model.Project;
import com.springbootbackend.repository.ProjectRepository;

@RestController
@RequestMapping("/")
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;

	// get all projects
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		List<Project> projectList = projectRepository.findAll();
		return projectList; 
	}
	
	// get individual project
	@GetMapping("/projects/{projectId}")
	public Optional<Project> getSingleProject(@PathVariable("projectId") Long projectId){	
		Optional<Project> project = projectRepository.findById(projectId);
		return project;
	}

}
