package com.registrion.page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.thymeleaf.expression.Objects;

import com.registrion.page.entity.UserFormEntity;
import com.registrion.page.service.Userserviceimpl;

@Controller
public class RegistrionController {
	
	@Autowired
	private Userserviceimpl userserviceimpl;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/registrion")
	public String registrion() {
		return "registrion";
	}

	@GetMapping("/firstpage")
	public String firstpage() {
		return "firstpage";
	}
	
	@PostMapping("/detils/save")
	public String cre( UserFormEntity userFormEntity) {
		userserviceimpl.cretedd(userFormEntity);
		return "registrion" ;
		
	}
	@PostMapping("/login")
	public String checked(@ModelAttribute("user") String email, String password) {
        UserFormEntity checkedd=userserviceimpl.check(email, password);
        
        if(checkedd.equals(checkedd)) 
        {    
  
            return "redirect:/";
        
            
        } else {
            return "redirect:/login";
            
        
        }
		
		
	}
	


}
