package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.Product;

@org.springframework.stereotype.Controller

public class EmployeeController {
	
	private static final Log logger = LogFactory.getLog(ProductController.class);
	
	@RequestMapping(value="/input-employee")
	public String inputEmployee() {
		logger.info("inputEmployee called");
		return "ProductForm";
	}

	@RequestMapping(value="/save-employee")
	public String saveEmployee(Product product, BindingResult bindingResult,
			Model model) {
		logger.info("saveEmployee called 2");
		
		logger.info("as map:" + model.asMap());
		// we don't need ProductForm anymore,l
		// Spring MVC can bind HTML forms to Java objects
		
		if (bindingResult.hasErrors()) {
			logger.info("has errors");
			FieldError fieldError = bindingResult.getFieldError();
			logger.info("Code:" + fieldError.getCode() 
					+ ", field:" + fieldError.getField());
			
			return "ProductForm";
		}
		
		// save product here
		
	    model.addAttribute("product", product);
	    
	   
		return "ProductDetails";
	}
	
	
	@ModelAttribute
	public Product addAccount(@RequestParam String number) {
		logger.info("addAccount called. number is " + number);
	    return new Product();
	}

	// Add multiple attributes

	@ModelAttribute
	public void populateModel(@RequestParam String number, Model model) {
	    logger.info("populateModel called. number is " + number);
	    model.addAttribute("blah");
	}
}
