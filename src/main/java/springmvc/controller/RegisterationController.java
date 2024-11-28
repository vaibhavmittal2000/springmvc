package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterationController {
	
	@RequestMapping("/form")
	public String showForm() {
		System.out.println("Registeration Form");
		return "registeration";
	}
}
