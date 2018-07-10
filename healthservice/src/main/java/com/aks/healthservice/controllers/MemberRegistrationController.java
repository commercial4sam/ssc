package com.aks.healthservice.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

import com.aks.healthservice.dto.RegisterMember;
import com.aks.healthservice.entity.Memberenrollment;
import com.aks.healthservice.repository.MemeberRepository;


@RestController
public class MemberRegistrationController {

	private Logger logger= Logger.getLogger(getClass().getName());
			
	@Autowired
	private MemeberRepository memberRepository;
	
	private  Memberenrollment enrollment;
	
	
	@RequestMapping(value="/aks/register",method=RequestMethod.POST)
	public @ResponseBody String memberRegistration(@RequestBody RegisterMember registerMember,BindingResult binding){
			enrollment= new Memberenrollment();
			
		logger.info("Entering Inside MemberRegistration ***"+registerMember.getMemberID());
		
		enrollment.setMemberid(Integer.parseInt(registerMember.getMemberID()));
		enrollment.setFirstname(registerMember.getFirstName());
		enrollment.setLastname(registerMember.getLastName());
		enrollment.setCity(registerMember.getCity());
		logger.info("Data being inserted ***");
		memberRepository.save(enrollment);
		
		RestTemplate template = new RestTemplate();
		AsyncRestTemplate asynch;
	 
		return "Success";
	}
	
}
