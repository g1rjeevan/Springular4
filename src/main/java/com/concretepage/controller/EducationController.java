package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.concretepage.service.IEducationService;

@Controller
@RequestMapping("/info")
public class EducationController {
	@Autowired
	private IEducationService educationService;
	 
	
	

	
}
