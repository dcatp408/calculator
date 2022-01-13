package com.calculator.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.calculator.models.Project;
import com.calculator.services.CalculatorService;

public interface ProjectRepo extends CrudRepository<Project, Long>{
	 


	List<Project> findAll();

	Project save(CalculatorService calculator);
}
