package controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Employee;

@org.springframework.stereotype.Controller

public class EmployeeController {
	
	@RequestMapping(value="add-employee")
	public String inputEmployee(Model model) {
		model.addAttribute(new Employee());
		return "EmployeeForm";
	}

	@RequestMapping(value="save-employee")
	public String saveEmployee(@ModelAttribute Employee employee, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println("Code:" + fieldError.getCode() 
					+ ", field:" + fieldError.getField());
			return "EmployeeForm";
		}
		
		// save product here
		
	    model.addAttribute("employee", employee);
		return "EmployeeDetails";
	}
}
