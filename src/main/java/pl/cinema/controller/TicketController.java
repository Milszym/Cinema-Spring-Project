package pl.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tickets")
public class TicketController {

	@RequestMapping("")
	public String tickets(Model model){
		
		model.addAttribute("isSeanse", 0);
		
		return "tickets";
	}
	
}
