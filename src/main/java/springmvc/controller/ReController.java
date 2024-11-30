package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
//	Using RedirectView
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		//redirectView.setUrl("two");
		return redirectView;
	}
	
//	   Using Redirect Prefix
	/*
	 * @RequestMapping("/one") public String one() {
	 * System.out.println("This is one handler"); 
	 * return "redirect:/two"; 
	 * }
	 */
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second handler");
		return "registeration";
	}
	
}
