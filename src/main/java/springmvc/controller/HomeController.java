package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
//	@RequestMapping("/home")
//	public String home() {
//		System.out.println("This is home URL");  //This method sending static data on the UI page
// 		return "index";
//	}
	
	@RequestMapping(path="/home",method= RequestMethod.GET)
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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help URL");
		
		//Creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting the data
		modelAndView.addObject("name", "Pawan Mittal");
		modelAndView.addObject("number", 5678);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(78);
		
		modelAndView.addObject("random",list);
		
		//Setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
