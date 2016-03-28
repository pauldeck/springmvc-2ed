package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EmployeeService;
import domain.Employee;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;
	
	@RequestMapping(value="/highest-paid/{category}")
    public String getHighestPaid(@PathVariable int category, Model model) {
        Employee employee = employeeService.getHighestPaidEmployee(category);
        model.addAttribute("employee", employee);
        return "success";
    }
}