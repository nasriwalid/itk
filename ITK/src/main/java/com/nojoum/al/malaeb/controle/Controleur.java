package com.nojoum.al.malaeb.controle;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.hamcrest.collection.IsEmptyCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	@Autowired 
	private IFormation formationrep;
	//pour linjection d'une proprietée a partire de la fichier application.proprietées
	//@Value("${dir.images}")
	//private String dirIMG;
	
	
	
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
	   public String submitForm(@Valid  @ModelAttribute("memberr") Member memberr
			   ,BindingResult bindingResult
			   ,@RequestParam(name="picture")MultipartFile file
			   ,@RequestParam(name="form-file-pp")MultipartFile photoPP
			   ,@RequestParam(name="form-file-cin")MultipartFile photocin)throws Exception
	  
	   {
		if(bindingResult.hasErrors()) 
		{ System.out.println("------------------------------------------ validation errore");
			return "Form" ;	
		}
		 if (!(file.isEmpty())){
			 System.out.println("------------------------------------------");
			 //file.transferTo(new File(dirIMG));  
			 String current = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			 file.transferTo(new File(System.getProperty("user.home")+"/images/"+current+"_"+file.getOriginalFilename()));
			 memberr.setMemberPHOTO(current+"_"+file.getOriginalFilename());
			 
			 photoPP.transferTo(new File(System.getProperty("user.home")+"/images/"+current+"_"+photoPP.getOriginalFilename()));
			 memberr.setPpPHOTO(current+"_"+photoPP.getOriginalFilename());
			 
			 photocin.transferTo(new File(System.getProperty("user.home")+"/images/"+current+"_"+photocin.getOriginalFilename()));
			 memberr.setCinPHOTO(current+"_"+photocin.getOriginalFilename());
			
			
			 //System.getProperty("user.home")+"/images/"+file.getOriginalFilename()
		   }
		 
		regmember.save(memberr);
		return "Login";
	   }
	
	

}
