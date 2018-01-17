package com.nojoum.al.malaeb.controle;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nojoum.al.malaeb.dao.ICountry;
import com.nojoum.al.malaeb.dao.ILevel;
import com.nojoum.al.malaeb.dao.IMember;
import com.nojoum.al.malaeb.entities.Country;
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
	
	
	@GetMapping(value="/registration")
	  public String getRegistration(Model model) 
	 
	  {
		List<Country> countrys= countries.findAll();
		List<Level> levelss=levels.findAll();
		model.addAttribute("levelss",levelss);
		model.addAttribute("countys", countrys);
		Member memberr=new Member();
		
		return "Form" ;
	  }
	
	@PostMapping(value="/save")
	   public String submitForm(@Valid Member memberr)
	   {
		regmember.save(memberr);
		return "form";
	   }
	
	

}
