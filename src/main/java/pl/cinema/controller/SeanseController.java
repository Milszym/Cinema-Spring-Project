package pl.cinema.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.cinema.domain.Seanse;
import pl.cinema.service.SeanseService;

@Controller
@RequestMapping("/seanses")
public class SeanseController {

	@Autowired
	private SeanseService seanseService;
	
	@RequestMapping("")
	public String seanse(){
		
		return "seanses";
	}
	
	@RequestMapping("{day}")
	public String seanseByDay(Model model, @PathVariable("day") String day){
		
		Set<Seanse> seansesByDate = new HashSet<Seanse>();
		List<Seanse> seansesByDate2 = new ArrayList<Seanse>();
		
		java.util.Date date = new java.util.Date();
		java.sql.Date dateSql = new java.sql.Date(date.getYear(), date.getMonth(), Integer.parseInt(day));
		
		seansesByDate = seanseService.getSeansesByDate(dateSql);
		seansesByDate2.addAll(seansesByDate);
		model.addAttribute("seanses", seansesByDate2);
		
		return "seanses";
	}
}
