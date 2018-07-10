package com.aks.healthservice.test;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.aks.healthservice.controllers.MemberRegistrationController;
import com.aks.healthservice.dto.RegisterMember;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest
public class MemberRegistrationTest {

	@Autowired
    private MockMvc mvc;

	private Logger logger= Logger.getLogger(getClass().getName());
	
	@Mock
	private RegisterMember registerMember=Mockito.mock(RegisterMember.class);
	

	@Autowired
	private  MemberRegistrationController memberRegistration;
	
	
	@Before
	public void setupMember(){
		
	}
	
	@Test
	public void testSaveMember(){
		logger.info("Mock Object Value : FirstName :"+registerMember.getFirstName());
		Mockito.when(registerMember.getFirstName()).thenReturn("Muniasamy");
		Mockito.when(registerMember.getLastName()).thenReturn("Kanthasamy");
		Mockito.when(registerMember.getAddressLine1()).thenReturn("11 Rexford St");
		Mockito.when(registerMember.getCity()).thenReturn("New York");
		Mockito.when(registerMember.getDob()).thenReturn("04/25/1978");
		Mockito.when(registerMember.getSsn()).thenReturn("123456789");
		Mockito.when(registerMember.getState()).thenReturn("GA");
		Mockito.when(registerMember.getZip()).thenReturn("30338");
	}
	
	/*@Test
	public void tesMvcCalls(){
		
		 this.mvc.perform(get("/sboot/vehicle").accept(MediaType.TEXT_PLAIN))
         .andExpect(status().isOk()).andExpect(content().string("Honda Civic"));
	}*/
}
