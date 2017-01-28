package com.my.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.dao.MatchDao;
import com.my.model.Member;
import com.my.model.PersonalDetails;
import com.my.model.Preferences;
import com.my.model.PreferencesBinding;
import com.my.service.MemberService;
import com.my.service.PersonalDetailsService;
import com.my.service.PreferencesService;

@Controller
public class PreferencesController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	PreferencesService preferencesService;
	
	@Autowired
	PersonalDetailsService personalDetailsService;
	

	@Autowired
	MatchDao matchDao;
	
	
	
	@RequestMapping(value="/preferences",method=RequestMethod.GET)
	public String start(Model model){
		return "preferences";
	}
	
	@RequestMapping(value="/preferences",method=RequestMethod.POST)
	public String submitPreferences(@ModelAttribute PreferencesBinding preferencesBinding,
			BindingResult bindingResult,
			Model model,
			HttpSession httpSession){
		Preferences preferences = new Preferences();
		//Member member = memberService.getMemberById(preferencesBinding.getMemberId());
		Object memberObj = httpSession.getAttribute("member");
		Member member=null;
		if(memberObj!=null)
			member = (Member) memberObj;
		preferences.setMember(member);
		preferences.setMinAge(preferencesBinding.getMinAge());
		preferences.setMaxAge(preferencesBinding.getMaxAge());
		preferences.setMaritalStatus(preferencesBinding.getMaritalStatus());
		preferences.setPhysicalStatus(preferencesBinding.getPhysicalStatus());
		preferences.setBodyType(preferencesBinding.getBodyType());
		preferences.setComplexion(preferencesBinding.getComplexion());
		preferences.setFamilystatus(preferencesBinding.getFamilystatus());
		preferences.setFamilytype(preferencesBinding.getFamilytype());
		preferences.setFamilyvalues(preferencesBinding.getFamilyvalues());
		preferences.setEatingHabits(preferencesBinding.getEatingHabits());
		preferences.setDrinkingHabits(preferencesBinding.getDrinkingHabits());
		preferences.setSmokingHabits(preferencesBinding.getSmokingHabits());
		preferences.setManglik(preferencesBinding.getManglik());
		preferences.setStar(preferencesBinding.getStar());
		preferences.setRaasi(preferencesBinding.getRaasi());
		preferences.setEducation(preferencesBinding.getEducation());
		preferences.setOccupation(preferencesBinding.getOccupation());
		preferences.setIncome(preferencesBinding.getIncome());
		
		preferencesService.savePreferences(preferences);
		
		
		long memberId = member.getMemberId();
		List<Object[]> results = matchDao.matches(member,preferences);
		
		for(Object[] result:results){
			System.out.println(result[0]);
			System.out.print(" "+result[1]);
			System.out.print(" "+result[2]);
			System.out.print(" "+result[3]);
			System.out.print(" "+result[1]);
			System.out.print(" "+result[4]);
			System.out.print(" "+result[5]);
			System.out.print(" "+result[6]);
			System.out.print(" "+result[7]);
		}
		
		PersonalDetails personalDetails = personalDetailsService.getPersonalDetailsByMember(member);
		
		model.addAttribute("personalDetails", personalDetails);
		model.addAttribute("member", member);
		model.addAttribute("preferences",preferencesBinding);
		model.addAttribute("matchList", personalDetails);
		return "dailymatches";
		//return "redirect:profile";
	}
	
	

}
