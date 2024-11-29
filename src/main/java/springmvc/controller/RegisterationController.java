package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class RegisterationController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Coding");
		m.addAttribute("Desc", "Programming");
		System.out.println("Adding common data to model");
	}

	@RequestMapping("/form")
	public String showForm(Model m) {
		System.out.println("Creating Form");
		return "registeration";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute User user,Model model) {
		System.out.println(user);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String formHandler(@RequestParam("userEmail") String userEmail,
	 * 
	 * @RequestParam(name = "userName", required = false) String userName,
	 * 
	 * @RequestParam("userPassword") String userPassword, Model model) {
	 * 
	 * User user = new User(); user.setUserEmail(userEmail);
	 * user.setUserName(userName); user.setUserPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * System.out.println("User Email is: "+userEmail);
	 * System.out.println("User Name is: "+userName);
	 * System.out.println("User Password is: "+userPassword);
	 * 
	 * model.addAttribute("email", userEmail); 
	 * model.addAttribute("name", userName);
	 * model.addAttribute("pass", userPassword);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */
}
