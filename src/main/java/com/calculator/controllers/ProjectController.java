package com.calculator.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.calculator.models.Project;
import com.calculator.services.CalculatorService;
@Controller
public class ProjectController {
	
@Autowired CalculatorService projectServ;
// ================Choose a project =============
@GetMapping("/")
public String index() {
	return "dashboard.jsp";
}

@GetMapping("/redecorate")
public String redecorate() {
	return "redecorate_size.jsp";
}


@GetMapping("/facelift")
public String facelift() {
	return "facelift_size.jsp";
}

@GetMapping("/remodel")
public String remodel() {
	return "remodel_size.jsp";
}

@GetMapping("/home")
public String home() {
	return "home.jsp";
}

@GetMapping("/login")
public String login() {
	return "login.jsp";
}


// ====================ACTION===============
@PostMapping("/new/create")
public String createProject(@Valid @ModelAttribute("proj")Project project, BindingResult result, Model model) {
	projectServ.save(project);
	return "redirect:/thankyou";
}


}
