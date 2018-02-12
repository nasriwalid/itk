package com.nojoum.al.malaeb.controle;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nojoum.al.malaeb.dao.ICountry;
import com.nojoum.al.malaeb.dao.IFormation;
import com.nojoum.al.malaeb.dao.ILevel;
import com.nojoum.al.malaeb.dao.IMember;
import com.nojoum.al.malaeb.entities.Country;
import com.nojoum.al.malaeb.entities.Formation;
import com.nojoum.al.malaeb.entities.Level;
import com.nojoum.al.malaeb.entities.Member;

@Controller
public class Controleur {
	@Autowired
	private ICountry countries;
	@Autowired 
	private ILevel levels;
	@Autowired
	private IMember regmember;
	@Autowired IFormation formationrep;
	
	
	@GetMapping(value="/registration")
	  public String getRegistration(Model model) 
	 
	  {
		List<Country> countrys= countries.findAll();
		List<Level> levelss=levels.findAll();
		List<Formation> formations= formationrep.findAll();
		model.addAttribute("levelss",levelss);
		model.addAttribute("countys", countrys);
		model.addAttribute("formations", formations);
		Member memberr=new Member();
		model.addAttribute("memberr",memberr);
		
		return "Form" ;
	  }
	
	@PostMapping(value="/save")
	   public String submitForm(@Valid  @ModelAttribute("memberr") Member memberr)
	   {
		regmember.save(memberr);
		return "Form";
	   }
	
	

}
