package com.springbootbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReadmeController {
	@GetMapping("/")
	public String showReadme(){
		return "readme"; 
	}
}
