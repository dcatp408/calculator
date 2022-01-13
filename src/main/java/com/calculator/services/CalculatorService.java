package com.calculator.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.models.Project;
import com.calculator.repo.ProjectRepo;

@Service
public class CalculatorService {
	@Autowired 
	private ProjectRepo projectRepo;
	
//	============== CREATE / UPDATE=============
	public Project save(@Valid Project project) {
		return projectRepo.save(project);
	}

}
