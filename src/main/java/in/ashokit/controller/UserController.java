package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.UserDto;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@GetMapping("/view")
	public String showPage(Model model) {
		
		model.addAttribute("userDto", new UserDto());
		
		return "index";
		
	}
	
	@PostMapping("/register")
	
	public String registerHandler(@Valid UserDto userDto, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			return "index";
		}
		
		model.addAttribute("msg", "Successfully Registered...");
		
		return "success";
		
	}

}
