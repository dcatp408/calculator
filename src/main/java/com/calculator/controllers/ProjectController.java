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

//=============Choose a Size================


@GetMapping("/redecorate/single")
public String redecoratesingle(Model model) {
	model.addAttribute("proj", new Project()); 
	return "redecorate_single.jsp";
}

@GetMapping("/redecorate/multi")
public String redecoratemulti(Model model) {
	model.addAttribute("proj", new Project());
	return "redecorate_multi.jsp";
}

@GetMapping("/redecorate/house")
public String redecoratehouse(Model model) {
	model.addAttribute("proj", new Project());
	return "redecorate_house.jsp";
}

@GetMapping("/facelift/single")
public String faceliftsingle(Model model) {
	model.addAttribute("proj", new Project());
	return "facelift_single.jsp";
}

@GetMapping("/facelift/multi")
public String faceliftmulti(Model model) {
	model.addAttribute("proj", new Project());
	return "facelift_multi.jsp";
}

@GetMapping("/facelift/house")
public String facelifthouse(Model model) {
	model.addAttribute("proj", new Project());
	return "facelift_house.jsp";
}

@GetMapping("/remodel/single")
public String remodelsingle(Model model) {
	model.addAttribute("proj", new Project());
	return "remodel_single.jsp";
}

@GetMapping("/remodel/multi")
public String remodelmulti(Model model) {
	model.addAttribute("proj", new Project());
	return "remodel_multi.jsp";
}

@GetMapping("/remodel/house")
public String remodelhouse(Model model) {
	model.addAttribute("proj", new Project());
	return "remodel_house.jsp";
}

// ====================ACTION===============
@PostMapping("/new/create")
public String createProject(@Valid @ModelAttribute("proj")Project project, BindingResult result, Model model) {
	projectServ.save(project);
	return "redirect:/thankyou";
}


}
