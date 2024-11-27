package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	@RequestMapping("/home")
//	public String home() {
//		System.out.println("This is home URL");  //This method sending static data on the UI page
// 		return "index";
//	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home URL");
		
		model.addAttribute("name", "Vaibhav Mittal");  //This method sending dynamic data on the UI page
		model.addAttribute("id",1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vivek");
		friends.add("Karan");
		friends.add("Aayush");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about URL");
		return "about";
	}
}
