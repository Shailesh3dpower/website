package com.my.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.model.Member;
import com.my.model.PersonalDetailsModel;
import com.my.model.SearchBinding;
import com.my.service.SearchService;


@Controller
public class SearchController {
	
	@Autowired
	public SearchService searchService;
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String initialize(Model model){
		//model.addAttribute("personaldetails", new PersonalDetailsModel());
		return "search";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String submitPersonalDetails(@ModelAttribute SearchBinding searchBinding,
			BindingResult bindingResult,
			Model model,
			HttpSession httpSession){
		
		Object memberObj = httpSession.getAttribute("member");
		Member member=null;
		if(memberObj!=null)
			member = (Member) memberObj;
		
		searchService.getMatches(member,searchBinding);
		
		
		
		return "results";
	}

}
